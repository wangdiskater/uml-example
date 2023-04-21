package com.example;

import java.util.Date;

/**
 * @Author dwang
 * @Description 账号
 * @create 2023/4/21 17:30
 * @Modified By:
 */
public class Account {

    private Integer id;

    private String history;

    private Date opened;

    private AccountState state;

    public void setState(AccountState state) {
        this.state = state;
    }

    void borrowed(BookItem bookItem) {
    }

    void reserved(BookItem bookItem) {
    }

}
