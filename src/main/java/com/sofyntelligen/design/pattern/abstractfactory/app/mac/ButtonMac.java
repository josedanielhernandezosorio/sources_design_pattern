package com.sofyntelligen.design.pattern.abstractfactory.app.mac;

import com.sofyntelligen.design.pattern.abstractfactory.app.Button;

public class ButtonMac extends Button {
    @Override
    public void click() {
        System.out.println("Click  ---  ButtonMac()");
    }
}
