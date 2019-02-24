package com.visuality.consent.request

import android.annotation.SuppressLint

internal object RequestHolder {

    @SuppressLint("StaticFieldLeak")
    var currentRequestOperation: RequestOperation? = null
}
