package designpatterns.a_nofactory.districts;

import designpatterns.a_nofactory.attractions.Attraction;
import designpatterns.a_nofactory.attractions.LoopyCoaster;
import designpatterns.a_nofactory.attractions.TeacupSpin;
import designpatterns.a_nofactory.attractions.WaterSlideExtreme;

public class District {
    
    // client code
    public void setUp(String type) {

        // create an attraction based off of type of district
        Attraction attraction = null;

        if (type.equals("kid")) {
            attraction = new TeacupSpin();
        } else if (type.equals("general")) {
            attraction = new LoopyCoaster();
        } else if (type.equals("water")) {
            attraction = new WaterSlideExtreme();
        }
        
        // perform set up operations
        attraction.turnOn();
        attraction.test();
        attraction.allowEntry();
    }
}
