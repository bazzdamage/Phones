package interfaces;

public interface Internet {
    default void makeConnection() {
        System.out.println("Connecting via 4g...");
    };
}
