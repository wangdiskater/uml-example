package com.example;

/**
 * @Author dwang
 * @Description TODO
 * @create 2023/4/21 17:25
 * @Modified By:
 */
public class Author {

    String name;
    String biography;

    // 关联书本
    public void wrote(Book book) {
        System.out.println("wrote book =" + book);
    }
}
