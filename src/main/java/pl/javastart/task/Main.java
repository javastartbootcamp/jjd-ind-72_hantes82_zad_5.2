package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Room room1 = new Room(23, 31.5, true);
        Room room2 = new Room(23, 27, false);
        Room room3 = new Room(23, 20.3, true);
        Room room4 = new Room(23, 31, false);

//        Ustawiam temp w zaleznosci czy pokoj ma klime czy nie. Zakomentowane w celu dalszych testow ale dziala:)
        room1.tempMin(28);
//        room2.tempMin(25);
//        room3.tempMin(20);
//        room4.tempMin(27);

        System.out.println(room1.getActualTemp());
        System.out.println(room1.tempDecrease());
        System.out.println(room1.getActualTemp());
        System.out.println(room1.tempDecrease());
        System.out.println(room1.getActualTemp());
        System.out.println(room1.tempDecrease());
        System.out.println(room1.getActualTemp());
        System.out.println(room1.tempDecrease());
        System.out.println(room1.getActualTemp());
        System.out.println(room1.tempDecrease());
        System.out.println(room1.getActualTemp());
        
//        System.out.println(room3.getActualTemp());
//        System.out.println(room3.tempDecrease());
//        System.out.println(room3.getActualTemp());
//        System.out.println(room3.tempDecrease());
//        System.out.println(room3.getActualTemp());
    }
}
