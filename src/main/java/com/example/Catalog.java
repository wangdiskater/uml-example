package com.example;

import com.example.interfaces.Manage;
import com.example.interfaces.Search;

/**
 * @Author dwang
 * @Description 目录实现查找和管理
 * @create 2023/4/21 17:52
 * @Modified By:
 */
public class Catalog implements Search, Manage {
    @Override
    public void manage() {
        System.out.println("manage");
    }

    @Override
    public void searchFun() {
        System.out.println("search");
    }
}
