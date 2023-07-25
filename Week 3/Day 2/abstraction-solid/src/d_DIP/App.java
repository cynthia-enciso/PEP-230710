package d_DIP;

import java.util.ArrayList;
import java.util.List;

public class App {
    
    public static void main(String[] args) {
        // not using DI
        Microphone myDevice = new Microphone();
        System.out.println(myDevice.plugIntoUSB());

        // using DI
        Pluggable myDevice2 = new Microphone();
        // System.out.println(myDevice2.volume);
        System.out.println(myDevice2.plugIntoUSB());
        myDevice2 = new Mouse();
        System.out.println(myDevice2.plugIntoUSB());
    }
}
