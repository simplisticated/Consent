package com.visuality.consent.check

import android.content.Context
import android.content.pm.PackageManager

class CheckOperation internal constructor(
    private val permissions: Array<out String>,
    private val context: Context,
    private var onFinishedCallback: OnCheckOperationFinishedCallback? = null
) {

    var result = CheckResult.empty()
        private set

    fun whenFinished(callback: OnCheckOperationFinishedCallback): CheckOperation {
        this.onFinishedCallback = callback
        return this
    }

    internal fun start() {
        val callback = this.onFinishedCallback ?: return

        val allowedPermissions = arrayListOf<String>()
        val blockedPermissions = arrayListOf<String>()

        for (permission in this.permissions) {
            val checkResult = this.context.checkSelfPermission(permission)
            val permissionAllowed = checkResult == PackageManager.PERMISSION_GRANTED

            if (permissionAllowed) {
                allowedPermissions.add(permission)
            } else {
                blockedPermissions.add(permission)
            }
        }

        this.result = CheckResult(
            allowedPermissions.toTypedArray(),
            blockedPermissions.toTypedArray()
        )
        callback(this.result)
    }
}
