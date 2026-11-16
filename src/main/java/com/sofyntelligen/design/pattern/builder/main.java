package com.sofyntelligen.design.pattern.builder;

import com.sofyntelligen.design.pattern.builder.app.Sandwich;

import java.util.Scanner;

public class main {

    public static void main(String... args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Sandwich with everything");
        System.out.println(new Sandwich.Builder("integral")
                .cheese().tomato().sauce("spicy").builder());

        System.out.println("Sandwich without cheese");
        System.out.println(new Sandwich.Builder("garlic")
                .tomato().sauce("spicy").builder());


    }
}
