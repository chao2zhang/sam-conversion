package com.combozhc.kotlin

@FunctionalInterface
interface KotlinInterface2 {

    fun apply(id: Int): Boolean

    companion object {
        inline operator fun invoke(crossinline block: (Int) -> Boolean): KotlinInterface2 = object : KotlinInterface2 {
            override fun apply(id: Int) = block(id)
        }
    }
}