package com.desgin.factory;

import com.desgin.component.Button;
import com.desgin.component.Checkbox;

/**
 * @Author dwang
 * @Description 抽象工厂接口
 * @create 2023/4/21 18:46
 * @Modified By:
 */
public interface GUIFactory {

    Button createButton();
    Checkbox createCheckBox();


}
