package com.visuality.consent.request

import com.visuality.consent.types.Permission

data class RequestResult(
    val allowed: Array<Permission>,
    val blocked: Array<Permission>
) {

    val hasBlocked: Boolean
        get() = this.blocked.size > 0
}
