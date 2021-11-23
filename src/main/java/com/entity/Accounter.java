package com.entity;

public class Accounter {
    private String account;
    private String name;
    private String password;
    private int permission;

    public Accounter(String account, int permission) {
        this.account = account;
        this.permission=permission;
    }

    public String getName() {
        return account;
    }

    public void setName(String name) {
        this.account = name;
    }

    public String getUserName() {
        return name;
    }

    public void setUserName(String userName) {
        this.name = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
