package com.sofyntelligen.design.pattern.abstractfactory.app.windows;

import com.sofyntelligen.design.pattern.abstractfactory.app.Button;

public class ButtonWindows extends Button {
    @Override
    public void click() {
        System.out.println("Click  ---  ButtonWindows()");
    }
}
