package com.sofyntelligen.design.pattern.abstractfactory;

import com.sofyntelligen.design.pattern.abstractfactory.app.mac.MacFactory;
import com.sofyntelligen.design.pattern.abstractfactory.app.windows.WindowsFactory;

import java.util.Scanner;

public class main {

    public static void main(String... args) {
        Scanner reader = new Scanner(System.in);
        App app = new App();

        System.out.print("Which OS do you wish to use?\n" +
                "     1) Windows \n" +
                "     2) Mac \n");

        String choice = reader.next();
        if (choice.equals("1")) {
            app.render(new WindowsFactory());
        } else {
            app.render(new MacFactory());
        }

        System.out.print("Click on:\n" +
                "     1) Button \n" +
                "     2) Checkbox \n");

        String choiceGui = reader.next();
        if (choiceGui.equals("1")) {
            app.getButton().click();
        } else {
            app.getCheckbox().click();
        }
    }

}
