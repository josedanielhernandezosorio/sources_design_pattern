package com.sofyntelligen.design.pattern.abstractfactory.app.windows;

import com.sofyntelligen.design.pattern.abstractfactory.app.Checkbox;

public class CheckboxWindows extends Checkbox {
    @Override
    public void click() {
        System.out.println("Click  ---  CheckboxWindows()");
    }
}
