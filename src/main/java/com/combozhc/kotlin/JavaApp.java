package com.combozhc.kotlin;

public class JavaApp {

    private boolean isEven(int id) {
        return id % 2 == 0;
    }

    private boolean runIJavaRunner(IJavaRunner runner, int id) {
        return runner.run(id);
    }

    private void useIJavaRunner() {
        IJavaRunner iJavaRunner = id -> id % 2 == 0;
        runIJavaRunner(id -> id % 2 == 0, 3);
        runIJavaRunner(this::isEven, 3);
    }

    private boolean runFJavaRunner(FJavaRunner runner, int id) {
        return runner.apply(id);
    }

    private void useFJavaRunner() {
        IJavaRunner iJavaRunner = id -> id % 2 == 0;
        runFJavaRunner(id -> id % 2 == 0, 3);
        runFJavaRunner(this::isEven, 3);
    }

    private boolean runIKtRunner(IKtRunner runner, int id) {
        return runner.run(id);
    }

    private void useIKtRunner() {
        IKtRunner iKtRunner = id -> id % 2 == 0;
        runIKtRunner(id -> id % 2 == 0, 3);
        runIKtRunner(this::isEven, 3);
    }

    private void useFKtRunner() {
        // Kotlin Typealias is not accessible in Java, hence the code below won't compile
        // KtRunner fKtRunner = id -> id % 2 == 0;
    }

    public static void main(String[] args) {
        JavaApp javaApp = new JavaApp();
        javaApp.useFJavaRunner();
        javaApp.useIJavaRunner();
        javaApp.useIKtRunner();
    }
}
