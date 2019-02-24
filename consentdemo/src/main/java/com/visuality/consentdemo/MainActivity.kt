package com.visuality.consentdemo

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.visuality.consent.bridge.checkConsent
import com.visuality.consent.bridge.getConsent
import com.visuality.consent.bridge.handleConsent
import com.visuality.consent.bridge.runWithConsent
import com.visuality.consent.types.Permission

class MainActivity : AppCompatActivity() {

    private val checkPermissionsButton by lazy {
        this.findViewById<Button>(R.id.check_permissions_button)
    }

    private val requestPermissionsButton by lazy {
        this.findViewById<Button>(R.id.request_permissions_button)
    }

    private val runWithPermissionsButton by lazy {
        this.findViewById<Button>(R.id.run_with_permissions_button)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.setContentView(R.layout.activity_main)
        this.prepareCheckPermissionsButton()
        this.prepareRequestPermissionsButton()
        this.prepareRunWithPermissionsButton()
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        this.handleConsent(
            requestCode,
            permissions,
            grantResults
        )
    }

    private fun prepareCheckPermissionsButton() {
        this.checkPermissionsButton.setOnClickListener {
            val allowedAccess = !this.checkConsent(
                Permission.CAMERA,
                Permission.WRITE_EXTERNAL_STORAGE
            ).result.hasBlocked
            val text = if (allowedAccess) "All permissions are available"
                else "Some permissions are blocked"
            Toast.makeText(
                this,
                text,
                Toast.LENGTH_LONG
            ).show()
        }
    }

    private fun prepareRequestPermissionsButton() {
        this.requestPermissionsButton.setOnClickListener {
            this.getConsent(
                Permission.CAMERA,
                Permission.WRITE_EXTERNAL_STORAGE
            ).whenFinished { result ->
                val text = if (result.hasBlocked) "${result.blocked.size} permissions blocked"
                    else "All permissions are available"
                Toast.makeText(
                    this,
                    text,
                    Toast.LENGTH_LONG
                ).show()
            }
        }
    }

    private fun prepareRunWithPermissionsButton() {
        this.runWithPermissionsButton.setOnClickListener {
            this.runWithConsent(
                Permission.CAMERA,
                Permission.WRITE_EXTERNAL_STORAGE
            ) {
                Toast.makeText(
                    this,
                    "All permissions are available",
                    Toast.LENGTH_LONG
                ).show()
            }
        }
    }
}
