package com.sofyntelligen.design.pattern.abstractfactory.app.mac;

import com.sofyntelligen.design.pattern.abstractfactory.app.Button;
import com.sofyntelligen.design.pattern.abstractfactory.app.Checkbox;
import com.sofyntelligen.design.pattern.abstractfactory.app.GUIFactory;

public class MacFactory implements GUIFactory {
    @Override
    public Button createButton() {
        System.out.println("createButton()  ---  Mac");
        return new ButtonMac();
    }

    @Override
    public Checkbox createCheckbox() {
        System.out.println("createCheckbox()  ---  Mac");
        return new CheckboxMac();
    }
}
