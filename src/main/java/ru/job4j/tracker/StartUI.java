package ru.job4j.tracker;

import java.time.format.DateTimeFormatter;

public class StartUI {
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");

    public static void main(String[] args) {
        Item one = new Item();
        Item two = new Item(222, "two");

        String currentDateTimeFormat = one.getCreated().format(FORMATTER);
        System.out.println("Formatted date & time: " + currentDateTimeFormat);
        System.out.println(two);
    }
}
