package com.sofyntelligen.design.pattern.abstractfactory.app.mac;

import com.sofyntelligen.design.pattern.abstractfactory.app.Checkbox;

public class CheckboxMac extends Checkbox {
    @Override
    public void click() {
        System.out.println("Click  ---  CheckboxMac()");
    }
}
