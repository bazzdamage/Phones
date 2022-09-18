import enums.Location;
import locations.City;
import locations.House;

public class Travelsystem {

    private Person person;

    public Travelsystem(Person person) {
        this.person = person;
        System.out.println("let's go some walk, mr. " + person.getName());
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void travelToCity(City city) {
        System.out.println(person.getName() + " ride in the " + city.getName() + " city on his own leg");
        person.setCity(city);
    }
    public void travelToHouse(House house) {
        if (person.getCity().getPlaces().contains(house)) {
            System.out.println(person.getName() + " get to the " + house.getName() + " on his own leg");
            person.setHouse(house);
        } else System.out.println("No such place like " + house.getName() + " in this city");
    }
    public void walkTo (Location location) {
        if (person.getHouse().getRooms().contains(location)) {
            System.out.println(person.getName() + " walk to " + location);
            person.setLocation(location);
        } else System.out.println("OOOh no, it's too far from there...");
    }
}
