package phones;

import enums.Location;
import interfaces.Call;

public class StationaryPhone extends Phone implements Call {
    private Location location;

    public StationaryPhone(String model, Location location) {
        super(model);
        this.location = location;
    }

    @Override
    public void endCall() {
        System.out.println("I hung up the phone");
    }

    @Override
    public void makeCall() {
        System.out.println("I walk in the " + getLocation() + " and take a phone");
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
