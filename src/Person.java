import enums.Location;
import interfaces.isMoving;
import locations.City;
import locations.House;
import phones.Phone;

import java.util.ArrayList;
import java.util.List;

public class Person implements isMoving {
    private String name;
    private Location location;
    private City city;
    private House house;
    private List<Phone> pockets = new ArrayList<>();
    CheckMobile pc;
    PhoneSpawner ps = new PhoneSpawner(this);
    LocCheck lc = new LocCheck(this);

    public List<Phone> getPockets() {
        return pockets;
    }

    public void buyPhone(Phone phone) {
        ps.SpawnPhone(phone);
        System.out.println("...try to spawn " + phone.getModel());
    }

    public void interact(Phone phone) {
        PhoneInteractor pi = new PhoneInteractor(phone, this);
        pi.dial();
    }

    public void setPockets(List<Phone> pockets) {
        this.pockets = pockets;
    }

    public void putInPocket(Phone phone) {
        pc = new CheckMobile(phone);
        if (pc.isMobile(phone) && lc.inSameLoc(phone)) {
            pockets.add(phone);
            System.out.println(getName() + " put the " + phone.getModel() + " in pocket");
            phone.setLocation(Location.POCKET);
        } else if (lc.inSameLoc(phone) && !pc.isMobile(phone)) {
            System.out.println("And What?!?! Rip it bloody " + phone.getModel()
                    + " from the wall??? Are you lost your mind???");
        } else {
            System.out.println(phone.getModel() + " is already in my warm pocket");
        }
    }

    public void dropFromPocket(Phone phone) {
        if (getPockets().contains(phone)) {
            pockets.remove(phone);
            System.out.println(getName() + " throw this " + phone.getModel() + " away");
            phone.setCity(getCity());
            phone.setHouse(getHouse());
            phone.setLocation(getLocation());
        } else System.out.println("I checked all my pockets include secret one in the underwear, but i don't have the "
                + phone.getModel());
    }

    public Person(String name) {
        this.name = name;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void whereIAm() {
        System.out.println(getLocation().name());
    }

    @Override
    public void moveTo(Location location) {
        System.out.println(getName() + " slowly walking to the " + location.name());
        setLocation(location);
    }
}
