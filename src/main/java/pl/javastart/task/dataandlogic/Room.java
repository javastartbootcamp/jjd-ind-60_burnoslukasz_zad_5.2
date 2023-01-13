package pl.javastart.task.dataandlogic;

public class Room {
    private boolean airConditioner;
    private int squareFootage;
    private double temperature;

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

    public Room(int squareFootage, double temperature, boolean airConditioner) {
        this.squareFootage = squareFootage;
        this.temperature = temperature;
        this.airConditioner = airConditioner;

    }

    public double decreaseTemperature() {
        if (noConditioner()) {
            return getTemperature();
        } else if (isConditioner() && aboveMinTemperature()) {
            return setTemperature(getTemperature() - 1);
        } else {
            return setTemperature(21);
        }
    }

    private boolean isConditioner() {
        return isAirConditioner();
    }

    private boolean noConditioner() {
        return !isAirConditioner();
    }

    private boolean aboveMinTemperature() {
        return getTemperature() >= 22;
    }

    public String roomInfo() {
        return "Metraż pokoju: " + getSquareFootage() + "m2." + " " +
                " Temperatura Pokoju: " + getTemperature() + " st." +
                " Czy posiada klimatyzator?: " + isAirConditioner();
    }

}
