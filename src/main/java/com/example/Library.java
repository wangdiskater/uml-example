package com.example;

import java.util.List;

/**
 * @Author dwang
 * @Description TODO
 * @create 2023/4/21 17:53
 * @Modified By:
 */
public class Library {
    String name;

    String address;

    List<BookItem> library;

    Catalog catalog;

    public Library(Catalog catalog) {
        this.catalog = new Catalog();
    }



}
