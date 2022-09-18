package phones;

import enums.Location;
import interfaces.SMS;
import interfaces.Wireless;

public class PanasonicWireless extends StationaryPhone implements Wireless, SMS {

    private int coverage;
    private Location currentLocation;

    public PanasonicWireless(String model, int coverage, Location location) {
        super(model, location);
        this.coverage = coverage;
        currentLocation = super.getLocation();
    }

    public int getCoverage() {
        return coverage;
    }

    public void setCoverage(int coverage) {
        this.coverage = coverage;
    }

    public Location getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(Location currentLocation) {
        this.currentLocation = currentLocation;
    }

    @Override
    public void endCall() {
        super.endCall();
        System.out.println("I put the phone in " + super.getLocation().name());
    }
    public void endCall(Location location) {
        super.endCall();
        System.out.println("I put the phone in " + location.name());
        setCurrentLocation(location);
    }

    @Override
    public void makeCall() {
        System.out.println("I walk to the " + getCurrentLocation().name() + " , and take the phone");
    }

    @Override
    public void sendSMS() {
        System.out.println("Wow! I may texting on the home phone");
    }

    @Override
    public void makeCallOutside() {
        System.out.println("I take the phone and walk around the house");
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Coverage = " + getCoverage() +
                "\n" + "Current enums.Location = " + getCurrentLocation();
    }
}
