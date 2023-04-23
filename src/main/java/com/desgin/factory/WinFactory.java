package com.desgin.factory;

import com.desgin.component.Button;
import com.desgin.component.Checkbox;
import com.desgin.component.ext.WinButton;
import com.desgin.component.ext.WincheckBox;

/**
 * @Author dwang
 * @Description TODO
 * @create 2023/4/21 18:45
 * @Modified By:
 */
public class WinFactory implements GUIFactory {


    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public Checkbox createCheckBox() {
        return  new WincheckBox();
    }
}
