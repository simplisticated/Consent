package com.visuality.consentdemo

import android.Manifest
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.visuality.consent.getConsent

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.setContentView(R.layout.activity_main)

        this.getConsent(
            Manifest.permission.CAMERA,
            Manifest.permission.CALL_PHONE
        ).onFinished {
        }
    }
}
