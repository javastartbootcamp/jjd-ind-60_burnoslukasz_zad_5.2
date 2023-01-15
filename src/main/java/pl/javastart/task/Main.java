package pl.javastart.task;

import pl.javastart.task.dataandlogic.Room;

public class Main {

    public static void main(String[] args) {
        Room room1 = new Room(20, 23, true, 20);
        Room room2 = new Room(30, 23.7, true, 21.5);
        String s = room2.roomInfo();
        System.out.println(s);
        room2.decreaseTemperature();
        room2.decreaseTemperature();
        room2.decreaseTemperature();
        String currentTemp = room2.roomInfo();
        System.out.println(currentTemp);

    }
}
