package com.objectoriented.Demo13;

import java.util.ArrayList;
import java.util.Random;

public class Menber extends User {

    public Menber() {
    }

    public Menber(String name, int money) {
        super(name, money);
    }


    public void receive(ArrayList<Integer>list){
        //从多个红包抽取一个给自己
        //随机获取一个集合当中的索引编号
        int index = new Random().nextInt(list.size());//最小为0最大size
        //根据索引，从集合当中删除
      int delta=  list.remove(index);

      int money = super.getMoney();
        //
      super.setMoney(money+delta);
    }
}
