package com.company;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Room room1 = new Room();
        room1.setSize(30);
        room1.setType("Cтудия");
        Room room2 = new Room();
        room2.setSize(25);
        room2.setType("Cтудия");
        Room room3 = new Room();
        room3.setSize(50);
        room3.setType("Большая Комната");
        Room[] rooms1 = {room1,room2,room3};
        Home1 home1 = new Home1();
        home1.setStage("1");
        home1.setRooms(rooms1);


        Room room12 = new Room();
        room12.setSize(23);
        room12.setType("Cтудия");
        Room room22 = new Room();
        room22.setSize(70);
        room22.setType("Большая Комната");
        Room room32 = new Room();
        room32.setSize(15);
        room32.setType("Cтудия");
        ArrayList<Room> rooms2 = new ArrayList<Room>();
        rooms2.add(room12);
        rooms2.add(room22);
        rooms2.add(room32);
        Home2 home2 = new Home2();
        home2.setStage("2");
        home2.setRooms(rooms2);

        Room room13 = new Room();
        room13.setSize(26);
        room13.setType("Cтудия");
        Room room23 = new Room();
        room23.setSize(34);
        room23.setType("Большая Комната");
        Room room33 = new Room();
        room33.setSize(14);
        room33.setType("Cтудия");
        LinkedList<Room> rooms3 = new LinkedList<Room>();
        rooms3.add(room13);
        rooms3.add(room23);
        rooms3.add(room33);
        Home3 home3 = new Home3();
        home3.setStage("3");
        home3.setRooms(rooms3);



        int S1 = 0;
        int S2 = 0;
        int S3 = 0;
        int S123 = 0;
        int BigRoomSize1 = 0;
        int BigRoomSize2 = 0;
        int BigRoomSize3 = 0;
        int BigRoomSize123 = 0;
        int StudiaSize1 = 0;
        int StudiaSize2 = 0;
        int StudiaSize3 = 0;
        int StudiaSize123 = 0;


    Iterator iterator1 = home1.getIterator();
    System.out.println("Этаж:" + home1.getStage());
    System.out.println("Комнаты:" );
    Room roomTest1 = new Room();
        while (iterator1.hasNext()){
            roomTest1 = iterator1.next();
            System.out.println("Тип комнаты:" + roomTest1.getType()+ "    Размер:" + roomTest1.getSize() + " кв.м");
            S1=S1+roomTest1.getSize();
            if (roomTest1.getType() == "Большая Комната"){
                BigRoomSize1 = BigRoomSize1 + roomTest1.getSize();
            }
            if (roomTest1.getType() == "Cтудия"){
                StudiaSize1 = StudiaSize1 + roomTest1.getSize();
            }

        }
        System.out.println("Суммарная площадь первого этажа: " + S1 + " кв.м");


        Iterator iterator2 = home2.getIterator();
        System.out.println("Этаж:" + home2.getStage());
        System.out.println("Комнаты:" );
        Room roomTest2 = new Room();
        while (iterator2.hasNext()){
            roomTest2 = iterator2.next();
            System.out.println("Тип комнаты:" + roomTest2.getType()+ "    Размер:" + roomTest2.getSize() + " кв.м");
            S2=S2+roomTest2.getSize();
            if (roomTest2.getType() == "Большая Комната"){
                BigRoomSize2 = BigRoomSize2 + roomTest2.getSize();
            }
            if (roomTest2.getType() == "Cтудия"){
                StudiaSize2 = StudiaSize2 + roomTest2.getSize();
            }
        }
        System.out.println("Суммарная площадь второго этажа: " + S2 + " кв.м");

        Iterator iterator3 = home3.getIterator();
        System.out.println("Этаж:" + home3.getStage());
        System.out.println("Комнаты:" );
        Room roomTest3 = new Room();
        while (iterator3.hasNext()){
            roomTest3 = iterator3.next();
            System.out.println("Тип комнаты:" + roomTest3.getType()+ "    Размер:" + roomTest3.getSize() + " кв.м");
            S3=S3+roomTest3.getSize();
            if (roomTest3.getType() == "Большая Комната"){
                BigRoomSize3 = BigRoomSize3 + roomTest3.getSize();
            }
            if (roomTest3.getType() == "Cтудия"){
                StudiaSize3 = StudiaSize3 + roomTest3.getSize();
            }
        }
        System.out.println("Суммарная площадь третьего этажа: " + S3 + " кв.м");

        S123 = S1 + S2 + S3;
        BigRoomSize123 = BigRoomSize1 + BigRoomSize2 + BigRoomSize3;
        StudiaSize123 = StudiaSize1 + StudiaSize2 + StudiaSize3;
        System.out.println("СУММАРНАЯ ПЛОЩАДЬ БОЛЬШИХ КОМНАТ: " + BigRoomSize123 + " кв.м");
        System.out.println("СУММАРНАЯ ПЛОЩАДЬ СТУДИЙ: " + StudiaSize123 + " кв.м");
        System.out.println("СУММАРНАЯ ПЛОЩАДЬ ДОМА: " + S123 + " кв.м");


    }
}
