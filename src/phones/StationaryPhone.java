package phones;

import enums.Location;
import interfaces.Call;

public class StationaryPhone extends Phone implements Call {
    private Location location;

    public StationaryPhone(String model) {
        super(model);
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
