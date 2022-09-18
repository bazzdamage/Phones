package locations;

import java.util.ArrayList;
import java.util.List;

public class City {
    private PhoneStore phoneStore;
    private String name;
    private List<House> places = new ArrayList<>();

    public City(String name) {
        this.name = name;

    }

    public void createPhoneStore () {
        if (phoneStore == null) {
            this.phoneStore = new PhoneStore("Svyaznoy");
        } else System.out.println("Svyaznoy is already open the Store in " + getName());
    }

    public PhoneStore getPhoneStore() {
        return phoneStore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<House> getPlaces() {
        return places;
    }

    public void setPlaces(List<House> places) {
        this.places = places;
    }

    public void addToPlaces(House house) {
        System.out.println("You revealed a place named " + house.getName());
        places.add(house);
    }

    public void removeFromPlaces(House house) {
        System.out.println("You forgotten a place named " + house.getName() + " like a Nightmare");
        places.remove(house);
    }
}
