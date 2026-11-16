package com.sofyntelligen.design.pattern.abstractfactory.app.windows;

import com.sofyntelligen.design.pattern.abstractfactory.app.Button;
import com.sofyntelligen.design.pattern.abstractfactory.app.Checkbox;
import com.sofyntelligen.design.pattern.abstractfactory.app.GUIFactory;

public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        System.out.println("createButton()  ---  Windows");
        return new ButtonWindows();
    }

    @Override
    public Checkbox createCheckbox() {
        System.out.println("createCheckbox()  ---  Windows");
        return new CheckboxWindows();
    }
}
