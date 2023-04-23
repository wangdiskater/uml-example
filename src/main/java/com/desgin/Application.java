package com.desgin;

import com.desgin.component.Button;
import com.desgin.factory.GUIFactory;

/**
 * @Author dwang
 * @Description TODO
 * @create 2023/4/21 18:50
 * @Modified By:
 */
public class Application {
    private GUIFactory factory;
    private Button button;

    public Application(GUIFactory factory) {
        this.factory = factory;
    }

    void createUI(){
        factory.createButton();
        factory.createCheckBox();

    }

    void paint(){
        System.out.println(button);
    }
}
