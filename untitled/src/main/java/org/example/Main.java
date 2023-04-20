package org.example;

import org.example.Observer.Button;
import org.example.Observer.IButtonListener;
import org.example.adapter.*;
import org.example.decorator.*;
import org.example.facade.Ftp;
import org.example.facade.Reader;
import org.example.facade.Writer;
import org.example.singleton.AClazz;
import org.example.singleton.BClazz;
import org.example.singleton.SocketClient;

import static javax.print.attribute.standard.ReferenceUriSchemesSupported.FTP;

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
        /*ICar audi = new Audi(1000);
        audi.showPrice();


        //a3
        ICar audi3 = new A3(audi, "A3");
        audi3.showPrice();
        //a4
        ICar audi4 = new A4(audi, "A4");
        audi4.showPrice();
        //a5
        ICar audi5 = new A5(audi, "A5");
        audi5.showPrice();

         */

//        Button button = new Button("버튼");
//
//        button.addListener(new IButtonListener() {
//            @Override
//            public void clickEvent(String event) {
//                System.out.println(event);
//            }
//        });
//        button.click("메시지 전달 : click1");
//        button.click("메시지 전달 : click2");
//        button.click("메시지 전달 : click3");
//        button.click("메시지 전달 : click4");
        Ftp ftpClient = new Ftp("www.naver.com", 22, "/home/etc");
        ftpClient.connect();
        ftpClient.moveDirectory();

        Writer writer = new Writer("text.tmp");
        writer.fileConnect();
        writer.write();

        Reader reader = new Reader("text.tmp");
        reader.fileConnect();
        reader.fileRead();

        reader.fileDisConnect();
        writer.fileDisConnect();
        ftpClient.disConnect();


    }
}