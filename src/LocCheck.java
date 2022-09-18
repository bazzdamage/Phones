import enums.Location;
import locations.City;
import locations.House;
import phones.Phone;

public class LocCheck {

    Person person;

    public LocCheck(Person person) {
        this.person = person;
    }

    public boolean inSameLoc(Phone phone) {
        return (phone.getCity().equals(person.getCity()) &&
                phone.getHouse().equals(person.getHouse()) &&
                phone.getLocation().equals(person.getLocation()));
    }


}
