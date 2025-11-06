package ru.job4j.tracker;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void showInfo() {
        System.out.println(this.active);
        System.out.println(this.status);
        System.out.println(this.message);
    }

    public static void main(String[] args) {
        Error one = new Error();
        Error two = new Error(true, 25, "Go");
        Error tree = new Error(false, -55, "false");

        one.showInfo();
        two.showInfo();
        tree.showInfo();
    }
}
