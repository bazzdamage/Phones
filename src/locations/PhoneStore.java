package locations;

import phones.Phone;

import java.util.ArrayList;
import java.util.List;

public class PhoneStore extends House{

    private final List<Phone> phones = new ArrayList<>();

    public PhoneStore(String name) {
        super(name);
    }

    public List<Phone> getPhones() {
        return phones;
    }

    public void addToStore (Phone phone) {
        phones.add(phone);
        System.out.println(phone.getModel() + " get to the store");
    }
    public void removeFromStore (Phone phone) {
        phones.remove(phone);
        System.out.println(phone.getModel() + " is out of store");
    }
}
