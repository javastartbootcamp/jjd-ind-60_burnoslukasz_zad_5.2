package pl.javastart.task;

import pl.javastart.task.dataandlogic.Room;

public class Main {

    public static void main(String[] args) {
        Room room = new Room(20, 23, true);
        Room room1 = new Room(30, 25, true);
        String s = room1.roomInfo();
        System.out.println(s);
        room1.decreaseTemperature(room1);
        room1.decreaseTemperature(room1);
        room1.decreaseTemperature(room1);
        room1.decreaseTemperature(room1);
        room1.decreaseTemperature(room1);
        String currentTemp = room1.roomInfo();
        System.out.println(currentTemp);

    }
}
