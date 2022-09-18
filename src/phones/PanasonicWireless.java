package phones;

import enums.Location;
import interfaces.SMS;
import interfaces.Wireless;

public class PanasonicWireless extends StationaryPhone implements Wireless, SMS {

    private int coverage;
    private Location currentLocation;

    public PanasonicWireless(String model, int coverage) {
        super(model);
        this.coverage = coverage;
        currentLocation = super.getLocation();
    }

    public int getCoverage() {
        return coverage;
    }

    public void setCoverage(int coverage) {
        this.coverage = coverage;
    }

    public Location getLocation() {
        return currentLocation;
    }

    public Location getBaseLocation() {
        return super.getLocation();
    }

    public void setCurrentLocation(Location currentLocation) {
        this.currentLocation = currentLocation;
    }

    @Override
    public void endCall() {
        super.endCall();
        System.out.println("I put the phone in " + getLocation().name());
    }

    public void endCall(Location location) {
        super.endCall();
        System.out.println("I put the phone in " + location.name());
        setCurrentLocation(location);
    }

    @Override
    public void makeCall() {
        if (getLocation().getRadius() <= this.getCoverage()) {
            System.out.println("I walk around in the " + getLocation().name() + " with my " + super.getModel());
        } else {
            System.out.println("I try to make a call, but hear only white noise...");
        }
    }

    @Override
    public void sendSMS() {
        System.out.println("Wow! I may texting on the home phone");
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Coverage = " + getCoverage() +
                "\n" + "Current enums.Location = " + getLocation();
    }
}
