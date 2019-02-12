package com.visuality.consent.bridge

import android.content.Context
import com.visuality.consent.check.CheckOperation
import com.visuality.consent.types.Permission

fun Context.checkConsent(
    vararg permissions: Permission
): CheckOperation {
    return CheckOperation(
        permissions,
        this,
        null
    ).also { operation ->
        operation.start()
    }
}
