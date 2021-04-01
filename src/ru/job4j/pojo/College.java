package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Ivan Ivanov");
        student.setGroup(11);
        student.setDate(new Date());
        System.out.println("Full name: " +  student.getFullName() + System.lineSeparator()
               + "Group: " + student.getGroup() + System.lineSeparator()
               + "Data: " + student.getDate());
    }
}
