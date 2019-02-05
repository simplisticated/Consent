package com.visuality.consent.check

import android.app.Activity
import android.content.pm.PackageManager

typealias OnCheckOperationFinishedCallback = (result: CheckResult) -> Unit

class CheckOperation internal constructor(
    private val permissions: Array<out String>,
    private val activity: Activity,
    private var onFinishedCallback: OnCheckOperationFinishedCallback? = null
) {

    fun onResult(callback: OnCheckOperationFinishedCallback): CheckOperation {
        this.onFinishedCallback = callback
        return this
    }

    internal fun start() {
        val allowedPermissions = arrayListOf<String>()
        val blockedPermissions = arrayListOf<String>()

        for (permission in this.permissions) {
            val checkResult = this.activity.checkSelfPermission(permission)
            val permissionAllowed = checkResult == PackageManager.PERMISSION_GRANTED

            if (permissionAllowed) {
                allowedPermissions.add(permission)
            } else {
                blockedPermissions.add(permission)
            }
        }

        this.onFinishedCallback?.let { callback ->
            val checkResult = CheckResult(
                allowedPermissions.toTypedArray(),
                blockedPermissions.toTypedArray()
            )
            callback(checkResult)
        }
    }
}
