package com.visuality.consentdemo

import android.Manifest
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.visuality.consent.bridge.getConsent

class MainActivity : AppCompatActivity() {

    private val requestButton by lazy {
        this.findViewById<Button>(R.id.request_button)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.setContentView(R.layout.activity_main)
        this.initializeRequestButton()
    }

    private fun initializeRequestButton() {
        this.requestButton.setOnClickListener {
            this.getConsent(
                Manifest.permission.CAMERA,
                Manifest.permission.CALL_PHONE
            ).onFinished {
            }
        }
    }
}
