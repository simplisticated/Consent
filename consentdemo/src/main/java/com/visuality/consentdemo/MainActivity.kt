package com.visuality.consentdemo

import android.Manifest
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.visuality.consent.bridge.getConsent
import com.visuality.consent.bridge.handleConsent

class MainActivity : AppCompatActivity() {

    private val requestButton by lazy {
        this.findViewById<Button>(R.id.request_button)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.setContentView(R.layout.activity_main)
        this.initializeRequestButton()
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

    private fun initializeRequestButton() {
        this.requestButton.setOnClickListener {
            this.getConsent(
                Manifest.permission.CAMERA,
                Manifest.permission.WRITE_EXTERNAL_STORAGE
            ).whenFinished { requestResult ->
                if (requestResult.hasBlocked) {
                    // Some permissions are blocked
                } else {
                    // All permissions are available
                }
            }
        }
    }
}
