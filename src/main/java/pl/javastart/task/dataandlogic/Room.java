package pl.javastart.task.dataandlogic;

public class Room {
    private boolean airConditioner;
    private int squareFootage;
    private double temperature;
    private double minTemperature;

    public double getMinTemperature() {
        return minTemperature;
    }

    public void setMinTemperature(double minTemperature) {
        this.minTemperature = minTemperature;
    }

    public int getSquareFootage() {
        return squareFootage;
    }

    public void setSquareFootage(int squareFootage) {
        this.squareFootage = squareFootage;
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

    public Room(int squareFootage, double temperature, boolean airConditioner, double minTemperature) {
        this.squareFootage = squareFootage;
        this.temperature = temperature;
        this.airConditioner = airConditioner;
        this.minTemperature = minTemperature;

    }

    public void decreaseTemperature() {
        if (!isAirConditioner()) {
            return;
        } else if (temperature >= minTemperature + 1) {
            setTemperature(temperature - 1);
        } else {
            setTemperature(minTemperature);
        }
    }

    public String roomInfo() {
        return "Metraż pokoju: " + getSquareFootage() + "m2." + " " +
                " Temperatura Pokoju: " + getTemperature() + " st." +
                " Czy posiada klimatyzator?: " + isAirConditioner();
    }

}
