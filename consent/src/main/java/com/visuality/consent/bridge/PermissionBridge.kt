package com.visuality.consent.bridge

import android.content.Context
import com.visuality.consent.check.CheckOperation
import com.visuality.consent.types.Permission

fun Permission.checkConsent(
    context: Context
): CheckOperation {
    return CheckOperation(
        arrayOf(this),
        context,
        null
    ).also { operation ->
        operation.start()
    }
}
