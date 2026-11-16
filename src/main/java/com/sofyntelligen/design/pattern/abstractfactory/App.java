package com.sofyntelligen.design.pattern.abstractfactory;

import com.sofyntelligen.design.pattern.abstractfactory.app.Button;
import com.sofyntelligen.design.pattern.abstractfactory.app.Checkbox;
import com.sofyntelligen.design.pattern.abstractfactory.app.GUIFactory;

public class App {

    private Button button;
    private Checkbox checkbox;

    public void render(GUIFactory guiFactory) {
        this.button = guiFactory.createButton();
        this.checkbox = guiFactory.createCheckbox();
    }

    public Button getButton() {
        return button;
    }

    public Checkbox getCheckbox() {
        return checkbox;
    }
}
