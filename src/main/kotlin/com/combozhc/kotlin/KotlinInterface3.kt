package com.combozhc.kotlin

@FunctionalInterface
interface KotlinInterface3 {

    fun apply(id: Int): Boolean

    @JvmDefault
    fun isEven(id: Int): Boolean {
        return id % 2 == 0
    }
}