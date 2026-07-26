package com.hoffi.wasm.wasmscratch

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform