package com.combozhc.kotlin;

import kotlin.jvm.functions.Function1;

public class JavaApp {

    private boolean isEven(int id) {
        return id % 2 == 0;
    }

    public boolean invokeJavaSam(int id, com.combozhc.kotlin.JavaSam sam) {
        return sam.apply(id);
    }

    private void useJavaSam() {
        com.combozhc.kotlin.JavaSam javaSam = id -> id % 2 == 0;
        invokeJavaSam(3, id -> id % 2 == 0);
        invokeJavaSam(4, this::isEven);
    }

    public boolean invokeJavaSam2(int id, com.combozhc.kotlin.JavaSam2 sam) {
        return sam.isEven(id) && sam.apply(id);
    }

    private void useJavaSam2() {
        com.combozhc.kotlin.JavaSam2 javaSam2 = id -> id % 2 == 0;
        invokeJavaSam2(3, id -> id % 2 == 0);
        invokeJavaSam2(4, this::isEven);
    }


    public boolean invokeJavaFunction(int id, com.combozhc.kotlin.JavaFunction function) {
        return function.apply(id);
    }

    private void useJavaFunction() {
        com.combozhc.kotlin.JavaFunction javaFunction = id -> id % 2 == 0;
        invokeJavaFunction(3, id -> id % 2 == 0);
        invokeJavaFunction(4, this::isEven);
    }

    private void useKotlinFunction() {
        Function1<Integer, Boolean> kotlinFunc = id -> id % 2 == 0;
        KotlinAppKt.invokeKotlinFunction(3, id -> id % 2 == 0);
        KotlinAppKt.invokeKotlinFunction(4, this::isEven);
    }

    private boolean invokeKotlinInterface(int id, KotlinInterface i) {
        return i.apply(id);
    }

    private void useKotlinInterface() {
        KotlinInterface kotlinInterface = id -> id % 2 == 0;
        invokeKotlinInterface(3, id -> id % 2 == 0);
        invokeKotlinInterface(4, this::isEven);
    }

    private boolean invokeKotlinInterface2(int id, KotlinInterface2 i) {
        return i.apply(id);
    }

    private void useKotlinInterface2() {
        KotlinInterface2 kotlinInterface = id -> id % 2 == 0;
        invokeKotlinInterface2(3, id -> id % 2 == 0);
        invokeKotlinInterface2(4, this::isEven);
    }

    private boolean invokeKotlinInterface3(int id, KotlinInterface3 i) {
        return i.isEven(id) && i.apply(id);
    }

    private void useKotlinInterface3() {
        KotlinInterface3 kotlinInterface = id -> id % 2 == 0;
        invokeKotlinInterface3(3, id -> id % 2 == 0);
        invokeKotlinInterface3(4, this::isEven);
    }

    public static void main(String[] args) {
        JavaApp javaApp = new JavaApp();
        javaApp.useJavaFunction();
        javaApp.useJavaSam();
        javaApp.useJavaSam2();
        javaApp.useKotlinFunction();
        javaApp.useKotlinInterface();
        javaApp.useKotlinInterface2();
        javaApp.useKotlinInterface3();
    }
}
