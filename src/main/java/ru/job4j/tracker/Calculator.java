package ru.job4j.tracker;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int a) {
        return a - x;
    }

    public double multiply(int a) {
        return a * x;
    }

    public double divide(int a) {
        return (double) a / x;
    }

    public double sumAllOperation(int a) {
        return minus(a) + multiply(a) + divide(a) + sum(a);
    }

    public static void main(String[] args) {
        int result = Calculator.sum(10);
        System.out.println(result);
        Calculator first = new Calculator();
        Calculator.sum(2);
        Calculator.minus(2);
        first.multiply(3);
        first.divide(5);
        first.sumAllOperation(2);
    }
}
