package hw;

public class Train {

    private String modelName;
    private double fuelConsumption;
    private int loadCapacity;

    public Train(String modelName, double fuelConsumption, int loadCapacity) {
        this.modelName = modelName;
        this.fuelConsumption = fuelConsumption;
        this.loadCapacity = loadCapacity;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

}
