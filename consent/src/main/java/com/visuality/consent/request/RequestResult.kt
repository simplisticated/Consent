package com.visuality.consent.request

data class RequestResult(
    val allowed: Array<out String>,
    val blocked: Array<out String>
) {

    val hasBlocked: Boolean
        get() = this.blocked.size > 0
}
