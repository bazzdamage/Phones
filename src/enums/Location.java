package enums;

public enum Location {

    POCKET(0),

    KITCHEN(5),

    ROOM(6),

    YARD(60),

    CLASS(500),

    DIRECTORS_CAB(800);


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
