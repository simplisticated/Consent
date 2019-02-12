package com.visuality.consent.check

data class CheckResult internal constructor(
    val allowed: Array<out String>,
    val blocked: Array<out String>
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
