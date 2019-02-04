package com.visuality.consent

data class RequestResult(
    val allowed: Array<out String>,
    val blocked: Array<out String>
)
