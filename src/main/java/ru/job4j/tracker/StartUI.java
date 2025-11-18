package ru.job4j.tracker;

import java.time.format.DateTimeFormatter;

public class StartUI {
    public static void main(String[] args) {
        Item one = new Item();
        Item two = new Item(222, "two");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");

        String currentDateTimeFormat = one.getCreated().format(formatter);
        System.out.println("Formatted date & time: " + currentDateTimeFormat);
        System.out.println(two);
    }
}
