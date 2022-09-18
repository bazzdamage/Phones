package phones;

import enums.Location;
import interfaces.Call;
import locations.City;
import locations.House;

public class Phone implements Call {
    private City city;
    private House house;
    private Location location;
    private String model;

    public Phone(City city, House house, Location location, String model) {
        this.city = city;
        this.house = house;
        this.location = location;
        this.model = model;
    }

    public Phone(String model, City city, Location location) {
        this.model = model;
        this.location = location;
    }

    public Phone(String model) {
        this.model = model;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void makeCall() {
        System.out.println("i take the " + getModel() + " and make a call");
    }

    @Override
    public void endCall() {
        System.out.println("i hang up my " + getModel());
    }
}
