package phones;

import interfaces.AppFromExternalSources;

public class GooglePixel extends SmartPhone implements AppFromExternalSources {
    public GooglePixel(String model, int ram, double screenSize, int storage) {
        super(model, ram, screenSize, storage);
    }

    @Override
    public void installApp() {

    }
}
