package interfaces;

import enums.Location;

public interface isMoving {
    default void moveTo(Location location) {
    }
}
