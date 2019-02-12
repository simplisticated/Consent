package com.visuality.consent.bridge

import android.app.Activity
import android.content.Context
import com.visuality.consent.check.CheckOperation
import com.visuality.consent.request.RequestOperation
import com.visuality.consent.types.Permission

fun Array<Permission>.checkConsent(
    context: Context
): CheckOperation {
    val stringPermissions = this
        .map { it.identifier }
        .toTypedArray()
    return CheckOperation(
        stringPermissions,
        context,
        null
    ).also { operation ->
        operation.start()
    }
}

fun Array<Permission>.getConsent(
    activity: Activity
): RequestOperation {
    val stringPermissions = this
        .map { it.identifier }
        .toTypedArray()
    return RequestOperation(
        stringPermissions,
        activity,
        null
    ).also { operation ->
        operation.start()
    }
}
