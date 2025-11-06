package ru.job4j.tracker;

public class Reduce {
    private int[] array;

    public void to(int[] arrayArg) {
        array = arrayArg;
    }

    public void print() {
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 5};
        Reduce reduce = new Reduce();
        reduce.to(array);
        reduce.print();
    }
}