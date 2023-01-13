package pl.javastart.task;

import pl.javastart.task.dataandlogic.Room;

public class Main {

    public static void main(String[] args) {
        Room room = new Room(20, 23, true);
        String s = room.roomInfo();
        System.out.println(s);
        room.decreaseTemperature();
        room.decreaseTemperature();
        room.decreaseTemperature();
        room.decreaseTemperature();
        room.decreaseTemperature();
        String currentTemp = room.roomInfo();
        System.out.println(currentTemp);

    }
}
