package com.objectoriented.Demo13;

import java.util.ArrayList;

public class Manager extends  User {

    public Manager(){
    }

    public Manager(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> send(int totalMoney, int count){
        //需要一个集合，来存放若干个红包金额
        ArrayList <Integer> redList =new ArrayList<>();
        //首先看看群主有多少钱
        int leftMoney = super.getMoney();
        if (totalMoney>leftMoney){
            System.out.println("余额不足");
            return redList;//返回空集合
        }
        //扣去发出去的钱
       super.setMoney( leftMoney - totalMoney);
        //发红包需要平均拆分成count份
        int avg = totalMoney/count;
        int mod = totalMoney%count;//余额，取整
        //除不开的零头放入最后一个红包当中
        //把下面红包一个一个放入红包当中
        for (int i = 0; i < count -1; i++) {
            redList.add(avg);
        }
        //最后一个红包
        int last =avg +mod;
        redList.add(last);

        return redList;
    }

}

