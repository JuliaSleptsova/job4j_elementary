package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private  String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println(active);
        System.out.println(status);
        System.out.println(message);
    }

    public static void main(String[] args) {
        Error errorNumber1 = new Error();
        Error errorNumber2 = new Error(true, 112, "send");
        errorNumber1.printInfo();
        errorNumber2.printInfo();
    }
}
