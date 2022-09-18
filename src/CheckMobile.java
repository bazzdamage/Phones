import interfaces.Cellular;
import interfaces.Wireless;
import phones.Phone;

public class CheckMobile {

    Phone phone;

    public CheckMobile(Phone phone) {
        this.phone = phone;
    }

    public boolean isMobile(Phone phone) {
        return phone instanceof Cellular | phone instanceof Wireless;
    }

}
