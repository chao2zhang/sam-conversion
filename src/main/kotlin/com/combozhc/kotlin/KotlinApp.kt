package com.combozhc.kotlin

private fun isEven(id: Int) = id % 2 == 0

private fun runIJavaRunner(runner: IJavaRunner, id: Int) = runner.run(id)

private fun useIJavaRunner() {
    val iJavaRunner = IJavaRunner { id -> id % 2 == 0 }
    runIJavaRunner(IJavaRunner { id -> id % 2 == 0 }, 3)
    runIJavaRunner(IJavaRunner { isEven(it) } , 3)
}

private fun runFJavaRunner(runner: FJavaRunner, id: Int) = runner.apply(id)

private fun useFJavaRunner() {
    val iJavaRunner = FJavaRunner { id -> id % 2 == 0 }
    runFJavaRunner(FJavaRunner { id -> id % 2 == 0 }, 3)
    runFJavaRunner(FJavaRunner { isEven(it) } , 3)
}

private fun runIKtRunner(runner: IKtRunner, id: Int) = runner.run(id)

private fun useIKtRunner() {
    val iKtRunner = object : IKtRunner {
        override fun run(id: Int) = id % 2 == 0
    }
    runIKtRunner(object : IKtRunner {
        override fun run(id: Int) = id % 2 == 0
    }, 3)
    runIKtRunner(object : IKtRunner {
        override fun run(id: Int) = isEven(id)
    }, 3)
}

private fun runIOverloadedKtRunner(runner: IOvderloadedKtRunner, id: Int) = runner.run(id)

private fun useIOverloadedKtRunnerFix() {
    val iKtRunner = IOvderloadedKtRunner {
        id -> id % 2 == 0
    }
    runIOverloadedKtRunner(IOvderloadedKtRunner {
        id -> id % 2 == 0
    }, 3)
    runIOverloadedKtRunner(IOvderloadedKtRunner {
        id -> id % 2 == 0
    }, 3)
}

private fun runFKtRunner(runner: FKtRunner, id: Int): Boolean {
    return runner(id)
}

private fun useFKtRunner() {
    val fKtRunner : FKtRunner = { id -> id % 2 == 0 }
    runFKtRunner({ id -> id % 2 == 0 }, 3)
    runFKtRunner(::isEven, 3)
}

class KotlinApp {

    companion object {

        @JvmStatic
        fun main() {
            useFJavaRunner()
            useIJavaRunner()
            useIKtRunner()
            useFKtRunner()
        }
    }
}
