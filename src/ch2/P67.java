package ch2;

import java.util.ArrayList;

public class P67 {
    public static void main(String args[]) {
        final String name = "GeniusK";
        System.out.println("Hello " + name);
        //Hello GeniusK
        final ArrayList<String> arrName = new ArrayList<String>();
        arrName.add("Genie");
        arrName.add("Genius");
        arrName.add("KimGenius");
        arrName.add("GeniusK");
        System.out.println("Hello " + arrName.toString());
        //Hello [Genie, Genius, KimGenius, GeniusK][0]
        System.out.println("Hello " + arrName.get(0));
        //Hello Genie
        final String koName = "김영재";
        System.out.println("Hello " + koName + "입니다.");
        //Hello 김영재 입니다.
    }
}
