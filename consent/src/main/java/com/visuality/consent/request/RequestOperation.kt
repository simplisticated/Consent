package com.visuality.consent.request

import android.app.Activity
import com.visuality.consent.types.Permission

class RequestOperation internal constructor(
    private val permissions: Array<out String>,
    private val activity: Activity,
    internal var onFinishedCallback: OnRequestOperationFinishedCallback? = null
) {

    fun whenFinished(callback: OnRequestOperationFinishedCallback): RequestOperation {
        this.onFinishedCallback = callback
        return this
    }

    internal fun start() {
        this.activity.requestPermissions(
            permissions,
            REQUEST_CODE
        )
    }

    internal companion object {
        internal const val REQUEST_CODE = Int.MAX_VALUE
    }
}
