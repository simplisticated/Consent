package com.visuality.consent

import android.content.Context

typealias OnFinishedCallback = (result: RequestResult) -> Unit

class RequestManager internal constructor(
    private var permissions: Array<out String>,
    private var context: Context,
    private var onFinishedCallback: OnFinishedCallback? = null
) {

    fun onFinished(callback: OnFinishedCallback): RequestManager {
        this.onFinishedCallback = callback
        return this
    }

    private fun request() {
        TODO("Request")
    }
}
