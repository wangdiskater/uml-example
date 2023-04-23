package com.desgin.factory;

import com.desgin.component.Button;
import com.desgin.component.Checkbox;
import com.desgin.component.ext.MacButton;
import com.desgin.component.ext.MacCheckbox;

/**
 * @Author dwang
 * @Description TODO
 * @create 2023/4/21 18:50
 * @Modified By:
 */
public class MacFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckBox() {
        return new MacCheckbox();
    }
}
