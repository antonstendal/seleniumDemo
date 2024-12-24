package com.sheikotester.tests;

import java.util.Random;

public class RandomTest {
    public static void main(String[] args) {

        Random random = new Random();

        System.out.println("test" + random.nextInt(100000) + "@.com");
    }
}
