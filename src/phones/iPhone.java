package phones;

import interfaces.Cellular;

public class iPhone extends SmartPhone {

    public iPhone(String model, int ram, double screenSize, int storage) {
        super(model, ram, screenSize, storage);
    }

    @Override
    public void makeConnection() {
        super.makeConnection();
        System.out.println("And opening Safari...");
    }
}
