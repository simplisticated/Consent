package com.visuality.consent.check

import android.content.Context
import android.content.pm.PackageManager
import com.visuality.consent.types.Permission
import com.visuality.consent.types.permissionByIdentifier

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
        val allowedPermissions = arrayListOf<Permission>()
        val blockedPermissions = arrayListOf<Permission>()

        for (permissionIdentifier in this.permissions) {
            val permission = permissionByIdentifier(
                permissionIdentifier
            ) ?: continue
            val checkResult = this.context.checkSelfPermission(permissionIdentifier)
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
        this.onFinishedCallback?.let {
            it(this.result)
        }
    }
}
