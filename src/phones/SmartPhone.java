package phones;

import interfaces.Internet;

public class SmartPhone extends Phone implements Internet {
    private int ram;
    private double screenSize;
    private int storage;

    public SmartPhone(String model, int ram, double screenSize, int storage) {
        super(model);
        this.ram = ram;
        this.screenSize = screenSize;
        this.storage = storage;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n" + "RAM = " + getRam() + "GB" +
                "\n" + "Screen Size = " + getScreenSize() + " inches" +
                "\n" + "Internal Memory = " + getStorage() + "GB";
    }
}
