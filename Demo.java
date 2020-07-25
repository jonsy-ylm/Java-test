package com.objectoriented.Demo13;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        Manager manager = new Manager("群主",100);

        Menber one =new Menber("A",0);
        Menber two =new Menber("A",0);
        Menber three =new Menber("A",0);


        ArrayList<Integer> redList =manager.send(20,3);
        one.receive(redList);
        two.receive(redList);
        three.receive(redList);

        manager.show();
        one.show();
        two.show();
        three.show();

    }
}
