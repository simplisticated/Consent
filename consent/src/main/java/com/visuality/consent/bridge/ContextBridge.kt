package com.visuality.consent.bridge

import android.content.Context
import com.visuality.consent.check.CheckOperation

fun Context.checkConsent(
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
