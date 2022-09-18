import enums.Location;
import locations.City;
import locations.House;
import locations.PhoneStore;
import phones.GooglePixel;
import phones.PanasonicWireless;
import phones.StationaryPhone;
import phones.iPhone;

public class TestCase {

    public void test() {
        Person dude = new Person("Dude");
        Travelsystem legs = new Travelsystem(dude);

        City city = new City("LA");
        city.createPhoneStore();
        House school = new House("School");
        House home = new House("Home");
        city.addToPlaces(school);
        city.addToPlaces(home);
        home.addRoom(Location.ROOM);
        home.addRoom(Location.KITCHEN);
        home.addRoom(Location.YARD);
        school.addRoom(Location.CLASS);
        school.addRoom(Location.DIRECTORS_CAB);

        iPhone iphone = new iPhone("iPhone 4S", 1, 4.5, 16);
        GooglePixel pixel = new GooglePixel("Google Pixel 4", 4, 6, 64);
        PanasonicWireless panasonic = new PanasonicWireless("Panasonic Wireless", 120);
        StationaryPhone sovietRedPhone = new StationaryPhone("Soviet Red Phone");

        PhoneStore store = city.getPhoneStore();
        store.addToStore(iphone);
        store.addToStore(pixel);
        store.addToStore(panasonic);
        store.addToStore(sovietRedPhone);

        legs.travelToCity(city);
        legs.travelToHouse(home);
        legs.walkTo(Location.CLASS);
        legs.walkTo(Location.KITCHEN);

        dude.buyPhone(iphone);
        dude.buyPhone(pixel);
        dude.buyPhone(panasonic);
        dude.buyPhone(sovietRedPhone);

        dude.putInPocket(iphone);
        dude.putInPocket(pixel);
        dude.putInPocket(panasonic);
        dude.putInPocket(iphone);

        dude.interact(iphone);
        dude.interact(pixel);
        dude.interact(sovietRedPhone);
        dude.interact(panasonic);

        legs.walkTo(Location.ROOM);

        dude.dropFromPocket(sovietRedPhone);
        dude.interact(panasonic);

    }




}
