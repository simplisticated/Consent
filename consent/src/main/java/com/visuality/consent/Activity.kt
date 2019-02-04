package com.visuality.consent

import android.app.Activity

fun Activity.getConsent(
    vararg permissions: String
): RequestManager {
    return RequestManager(
        permissions,
        this,
        null
    )
}
