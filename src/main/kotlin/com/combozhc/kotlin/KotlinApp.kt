package com.combozhc.kotlin

private fun isEven(id: Int) = id % 2 == 0

private fun invokeJavaFunction(id: Int, function: JavaFunction) = function.apply(id)

private fun useJavaFunction() {
    val javaFunction = JavaFunction { id -> id % 2 == 0 }
    invokeJavaFunction(3, JavaFunction { id -> id % 2 == 0 })
    invokeJavaFunction(4, JavaFunction { isEven(it) })

    JavaApp().invokeJavaFunction(3) { id -> id % 2 == 0 }
    JavaApp().invokeJavaFunction(4, ::isEven)
    JavaApp().invokeJavaFunction(4) { isEven(it) }
}

private fun invokeJavaSam(id: Int, sam: JavaSam) = sam.apply(id)

private fun useJavaSam() {
    val javaSam = JavaSam { id -> id % 2 == 0 }
    invokeJavaSam(3, JavaSam { id -> id % 2 == 0 })
    invokeJavaSam(4, JavaSam { isEven(it) })

    JavaApp().invokeJavaSam(3) { id -> id % 2 == 0 }
    JavaApp().invokeJavaSam(4, ::isEven)
    JavaApp().invokeJavaSam(4) { isEven(it) }
}

private fun invokeJavaSam2(id: Int, sam: JavaSam2) = sam.isEven(id) && sam.apply(id)

private fun useJavaSam2() {
    val javaSam = JavaSam2 { id -> id % 2 == 0 }
    invokeJavaSam2(3, JavaSam2 { id -> id % 2 == 0 })
    invokeJavaSam2(4, JavaSam2 { isEven(it) })

    JavaApp().invokeJavaSam2(3) { id -> id % 2 == 0 }
    JavaApp().invokeJavaSam2(4, ::isEven)
    JavaApp().invokeJavaSam2(4) { isEven(it) }
}

private fun invokeKotlinFunction(id: Int, f: KotlinFunction) = f(id)

private fun useKotlinFunction() {
    val kotlinFunction : KotlinFunction = { id -> id % 2 == 0 }
    invokeKotlinFunction(3) { id -> id % 2 == 0 }
    invokeKotlinFunction(4) { isEven(it) }
    invokeKotlinFunction(4, ::isEven)
}

private fun invokeKotlinInterface(id: Int, i: KotlinInterface) = i.apply(id)

private fun useKotlinInterface() {
    val kotlinInterface = object : KotlinInterface {
        override fun apply(id: Int) = id % 2 == 0
    }
    invokeKotlinInterface(3, object : KotlinInterface {
        override fun apply(id: Int) = id % 2 == 0
    })
    invokeKotlinInterface(4, object : KotlinInterface {
        override fun apply(id: Int) = isEven(id)
    })
}

private fun invokeKotlinInterface2(id: Int, i: KotlinInterface2) = i.apply(id)

private fun useKotlinInterface2() {
    val kotlinInterface2 = KotlinInterface2 {
        id -> id % 2 == 0
    }
    invokeKotlinInterface2(3, KotlinInterface2 {
        id -> id % 2 == 0
    })
    invokeKotlinInterface2(4, KotlinInterface2 {
            id -> id % 2 == 0
    })
}

private fun invokeKotlinInterface3(id: Int, i: KotlinInterface3) = i.isEven(id) && i.apply(id)

private fun useKotlinInterface3() {
    val kotlinInterface3 = object : KotlinInterface3 {
        override fun apply(id: Int) = id % 2 == 0
    }
    invokeKotlinInterface3(3, object : KotlinInterface3 {
        override fun apply(id: Int) = id % 2 == 0
    })
    invokeKotlinInterface3(4, object : KotlinInterface3 {
        override fun apply(id: Int) = id % 2 == 0
    })
}

fun main() {
    useJavaFunction()
    useJavaSam()
    useJavaSam2()
    useKotlinFunction()
    useKotlinInterface()
    useKotlinInterface2()
    useKotlinInterface3()
}