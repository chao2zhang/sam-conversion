package com.combozhc.kotlin

interface IOvderloadedKtRunner {

    fun run(id: Int): Boolean

    companion object {
        inline operator fun invoke(crossinline block: (Int) -> Boolean): IOvderloadedKtRunner = object : IOvderloadedKtRunner {
            override fun run(id: Int) = block(id)
        }
    }
}