package com.visuality.consent.check

import com.visuality.consent.types.Permission

data class CheckResult internal constructor(
    val allowed: Array<Permission>,
    val blocked: Array<Permission>
) {

    val hasBlocked: Boolean
        get() = this.blocked.size > 0

    internal companion object {
        internal fun empty() = CheckResult(
            emptyArray(),
            emptyArray()
        )
    }
}
