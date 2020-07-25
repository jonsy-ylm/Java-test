package com.objectoriented.Demo13;

public class User {

    private String name;//名字
    private int  money;//余额

    public User() {
    }

    public User(String name, int money) {
        this.name = name;
        this.money = money;
    }
    public void show(){
        System.out.println("我叫："+name+",有多少钱"+money);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
