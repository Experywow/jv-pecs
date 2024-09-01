package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int loadCapacity;
    private int grossWeight;

    public Truck() {
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public int getGrossWeight() {
        return grossWeight;
    }

    public void setGrossWeight(int grossWeight) {
        this.grossWeight = grossWeight;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
