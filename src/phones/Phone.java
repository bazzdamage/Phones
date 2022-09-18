package phones;

import interfaces.Call;

public class Phone implements Call {
    private String model;

    public Phone(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return getModel();
    }

    @Override
    public void makeCall() {
        System.out.println("i take the phone and make a call");
    }

    @Override
    public void endCall() {
        System.out.println("i hang up the phone");
    }
}
