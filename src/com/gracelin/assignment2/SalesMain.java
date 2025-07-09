package com.gracelin.assignment2;

public class SalesMain {
    public static void main(String[] args) {
        Student s1 = new Student(); // default constructor

        Commission c1 = new Commission();
        c1.acceptDetails();
        c1.calculateCommission();
    }
}
