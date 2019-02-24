package com.visuality.consent.bridge

import android.content.Context
import com.visuality.consent.check.CheckOperation
import com.visuality.consent.types.Permission

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

fun Context.checkConsent(
    vararg permissions: Permission
): CheckOperation {
    val stringPermissions = permissions
        .map { it.identifier }
        .toTypedArray()
    return CheckOperation(
        stringPermissions,
        this,
        null
    ).also { operation ->
        operation.start()
    }
}

fun Context.runWithConsent(
    vararg permissions: String,
    block: () -> Unit
) {
    val operation = CheckOperation(
        permissions,
        this
    ) {
        if (!it.hasBlocked) {
            block()
        }
    }

    operation.start()
}

fun Context.runWithConsent(
    vararg permissions: Permission,
    block: () -> Unit
) {
    val stringPermissions = permissions
        .map { it.identifier }
        .toTypedArray()
    val operation = CheckOperation(
        stringPermissions,
        this
    ) {
        if (!it.hasBlocked) {
            block()
        }
    }

    operation.start()
}
