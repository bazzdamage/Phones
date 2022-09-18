import enums.Location;
import phones.GooglePixel;
import phones.PanasonicWireless;
import phones.iPhone;

public class TestCase {

    public void test() {
        iPhone iphone = new iPhone("phones.iPhone 4S", 1, 4.5, 16);
        GooglePixel pixel = new GooglePixel("Google Pixel 4", 4, 6, 64);
        PanasonicWireless panasonic = new PanasonicWireless("Panasonic interfaces.Wireless", 120, Location.KITCHEN);

        iphone.makeCall();
        pixel.makeCall();
        panasonic.makeCall();

        iphone.makeConnection();
    }




}
