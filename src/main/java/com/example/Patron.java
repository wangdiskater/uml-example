package com.example;

import com.example.interfaces.Search;
import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.List;

/**
 * @Author dwang
 * @Description 图书馆使用人
 * @create 2023/4/21 17:49
 * @Modified By:
 */
public class Patron {

    private List<Account> accounts;
    private String name;
    private String address;


    void search() {
        Catalog catalog = new Catalog();
        catalog.searchFun();

    }

}
