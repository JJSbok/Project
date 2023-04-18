package org.example;

import org.example.adapter.*;
import org.example.decorator.Audi;
import org.example.decorator.ICar;
import org.example.singleton.AClazz;
import org.example.singleton.BClazz;
import org.example.singleton.SocketClient;

// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
/*
        AClazz aClazz = new AClazz();
        BClazz bClazz = new BClazz();

        SocketClient aclient = aClazz.getSocketClient();
        SocketClient bclient = bClazz.getSocketClient();

        System.out.println("두개의 객체가 동일한가?");
        System.out.println(aclient.equals(bclient));



        HairDryer hairDryer = new HairDryer();
        connect(hairDryer);

        Cleaner cleaner = new Cleaner();

        E110V adapter = new SocketAdapter(cleaner);
        connect(adapter);

        AirConditoner airConditoner = new AirConditoner();

        E110V airAdapter = new SocketAdapter(airConditoner);
        connect(airAdapter);
    }

 */
        ICar audi = new Audi(1000);
        audi.showPrice();

    }
public static void connect(E110V e110V){
        e110V.powerOn();
}
}