package designpatterns.b_simplefactoryandsingleton;

public class Announcement {
    
    // single static reference to the one announcement object
    private static Announcement announcement;

    // private constructor
    private Announcement() {}

    // public static method for other classes to use the one object
    public static Announcement getAnnouncement() {
        // object creation only happens once in first call to getAnnouncement
        if (announcement == null) {
            announcement = new Announcement();
        }

        return announcement;
    }

 // behavior
    public void printMessage(String message) {
        String ANSI_PURPLE = "\u001B[35m";
        String ANSI_RESET = "\u001B[0m";
        System.out.println(ANSI_PURPLE + message + ANSI_RESET);
    }
}
