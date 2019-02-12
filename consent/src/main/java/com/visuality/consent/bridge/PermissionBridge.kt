package com.visuality.consent.bridge

import android.app.Activity
import android.content.Context
import com.visuality.consent.check.CheckOperation
import com.visuality.consent.request.RequestOperation
import com.visuality.consent.types.Permission

fun Permission.checkConsent(
    context: Context
): CheckOperation {
    val stringPermissions = arrayOf(
        this.identifier
    )
    return CheckOperation(
        stringPermissions,
        context,
        null
    ).also { operation ->
        operation.start()
    }
}

fun Permission.getConsent(
    activity: Activity
): RequestOperation {
    val stringPermissions = arrayOf(
        this.identifier
    )
    return RequestOperation(
        stringPermissions,
        activity,
        null
    ).also { operation ->
        operation.start()
    }
}
