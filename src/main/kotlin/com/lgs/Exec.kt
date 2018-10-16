package com.lgs

import com.google.gson.Gson

fun main(args:Array<String>) {
    val person: String = args.getOrNull(0)?: "World"
    println(Gson().toJson(mapOf("message" to "Hello ${person}!")))
}