package pl.javastart.task.dataandlogic;

public class Room {
    private boolean airConditioner;
    private int squareMeter;
    private double temperature;
    private double minTemperature;

    public double getMinTemperature() {
        return minTemperature;
    }

    public void setMinTemperature(double minTemperature) {
        this.minTemperature = minTemperature;
    }

    public int getSquareFootage() {
        return squareMeter;
    }

    public void setSquareFootage(int squareFootage) {
        this.squareMeter = squareFootage;
    }

    public double getTemperature() {
        return temperature;
    }

    public double setTemperature(double temperature) {
        this.temperature = temperature;
        return temperature;
    }

    public boolean isAirConditioner() {
        return airConditioner;
    }

    public void setAirConditioner(boolean airConditioner) {
        this.airConditioner = airConditioner;
    }

    public Room(int squareMeter, double temperature, boolean airConditioner, double minTemperature) {
        this.squareMeter = squareMeter;
        this.temperature = temperature;
        this.airConditioner = airConditioner;
        this.minTemperature = minTemperature;

    }

    public void decreaseTemperature() {
        if (!airConditioner) {
            return;
        }
        if (temperature >= minTemperature + 1) {
            temperature--;
        } else {
            temperature = minTemperature;
        }
    }

    public String roomInfo() {
        return "Metraż pokoju: " + squareMeter + "m2." + " " +
                " Temperatura Pokoju: " + temperature + " st." +
                " Czy posiada klimatyzator?: " + airConditioner;
    }

}
