

// ========================================================

interface Pluggable {
    public abstract void canPlugIntoComputer();
}

class Microphone implements Pluggable {

    @Override
    public void canPlugIntoComputer() {
        System.out.println("Microphone plugged in!");
    }

}

class Headphones implements Pluggable {

    @Override
    public void canPlugIntoComputer() {
        System.out.println("Headphones plugged in!");
    }

}

// ========================================================

public class A_PolymorphicCastingRevisited {
    public static void main(String[] args) {
        // object as a value assigned to a supertype (interface type)
        Pluggable device = new Headphones();
        device.canPlugIntoComputer();

        device = new Microphone();
        device.canPlugIntoComputer();

        // object as a value passed in to parameter
        useDevice(new Microphone());
        useDevice(new Headphones());
    }

    public static void useDevice(Pluggable device) {
        device.canPlugIntoComputer();
    }
}
