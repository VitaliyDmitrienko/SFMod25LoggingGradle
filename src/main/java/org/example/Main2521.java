package org.example;

public class Main2521 {

    public static void main(String[] args) {
        StackTraceElement[] stack= Thread.currentThread().getStackTrace();
        for (StackTraceElement element :stack) {
            System.out.println(element);
        }
    }
}