package locations;

import enums.Location;

import java.util.ArrayList;
import java.util.List;

public class House extends City{

    private List<Location> rooms = new ArrayList<>();

    public House(String name) {
        super(name);
    }

    public List<Location> getRooms() {
        return rooms;
    }

    public void setRooms(List<Location> rooms) {
        this.rooms = rooms;
    }
    public void addRoom(Location room) {
        rooms.add(room);
        System.out.println("You explore a new room in " + this.getName() + ". Obviously it's a " + room.name());
    }
    public void removeRoom(Location room) {
        rooms.remove(room);
        System.out.println("You are mistake, the " + this.getName() + " don't have a " + room.name());
    }
}
