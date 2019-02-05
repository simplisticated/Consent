package com.visuality.consent.request

import android.content.Context

class RequestOperation internal constructor(
    private val permissions: Array<out String>,
    private val context: Context,
    private var onFinishedCallback: OnRequestOperationFinishedCallback? = null
) {

    fun onFinished(callback: OnRequestOperationFinishedCallback): RequestOperation {
        this.onFinishedCallback = callback
        return this
    }

    internal fun start() {
        TODO("Request")
    }
}
