import interfaces.Wireless;
import phones.PanasonicWireless;
import phones.Phone;

public class PhoneSpawner {

    Person person;

    public PhoneSpawner(Person person) {
        this.person = person;
    }

    public void SpawnPhone(Phone phone) {
        if (person.getCity().getPhoneStore().getPhones().contains(phone)) {
            if (person.getCity() != null && person.getHouse() != null && person.getLocation() != null) {
                person.getCity().getPhoneStore().removeFromStore(phone);
                phone.setCity(person.getCity());
                phone.setHouse(person.getHouse());
                phone.setLocation(person.getLocation());
                if (phone instanceof PanasonicWireless) {
                    ((PanasonicWireless) phone).setCurrentLocation(person.getLocation());
                }
            } else person.putInPocket(phone);
        } else System.out.println(phone.getModel() + " is not exist in whole UNIVERSE, stop dreaming");
    }

}
