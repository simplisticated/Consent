package com.visuality.consent.bridge

import android.app.Activity
import com.visuality.consent.check.CheckOperation
import com.visuality.consent.request.RequestOperation

fun Activity.checkConsent(
    vararg permissions: String
): CheckOperation {
    return CheckOperation(
        permissions,
        this,
        null
    ).also { operation ->
        operation.start()
    }
}

fun Activity.getConsent(
    vararg permissions: String
): RequestOperation {
    return RequestOperation(
        permissions,
        this,
        null
    ).also { operation ->
        operation.start()
    }
}
