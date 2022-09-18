import enums.Location;
import phones.Phone;

public class PhoneInteractor {

    CheckMobile pc;
    private Phone phone;
    private Person person;
    PhoneSpawner ps;
    LocCheck lc;

    public PhoneInteractor(Phone phone, Person person) {
        this.phone = phone;
        this.person = person;

    }

    public void dial() {
        pc = new CheckMobile(phone);
        ps = new PhoneSpawner(person);
        lc = new LocCheck(person);
        if (pc.isMobile(phone)) {
            if (phone.getLocation() == Location.POCKET | phone.getLocation() == person.getLocation()) {
                phone.makeCall();
                System.out.println(person.getName() + " chat with someone via " + phone.getModel());
                phone.endCall();
            }
        }
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
