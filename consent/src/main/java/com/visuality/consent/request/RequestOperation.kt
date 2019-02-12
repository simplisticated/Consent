package com.visuality.consent.request

import android.app.Activity
import com.visuality.consent.types.Permission

class RequestOperation internal constructor(
    private val permissions: Array<out Permission>,
    private val activity: Activity,
    internal var onFinishedCallback: OnRequestOperationFinishedCallback? = null
) {

    fun whenFinished(callback: OnRequestOperationFinishedCallback): RequestOperation {
        this.onFinishedCallback = callback
        return this
    }

    internal fun start() {
        val stringPermissions = this.permissions
            .map { it.identifier }
            .toTypedArray()

        this.activity.requestPermissions(
            stringPermissions,
            REQUEST_CODE
        )
    }

    internal companion object {
        internal const val REQUEST_CODE = Int.MAX_VALUE
    }
}
