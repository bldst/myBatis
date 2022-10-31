package com.example.mybatis.Card;

import java.io.Serializable;

public class Card implements Serializable {
    private static final long serialVersionUID=1L;
    private int id;
    private String code;
    private int balance;
    private short  enabled;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public short getEnabled() {
        return enabled;
    }

    public void setEnabled(short enabled) {
        this.enabled = enabled;
    }

    @Override
    public String toString() {
        return "Card{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", balance=" + balance +
                ", enabled=" + enabled +
                '}';
    }
}
