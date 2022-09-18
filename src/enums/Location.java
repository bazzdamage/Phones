package enums;

public enum Location {

    KITCHEN(5),

    ROOM(6),

    YARD(60),

    SCHOOL(500);

    private int radius;

    Location(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
