package designpatterns.c_factorymethod.districts;

import designpatterns.c_factorymethod.attractions.Attraction;

public abstract class District {

    // client code
    public void setUp() {
        // get attraction created somehow
        Attraction attraction;
        attraction = createAttractionFactory();

        // do set up process
        attraction.turnOn();
        attraction.test();
        attraction.allowEntry();
    }

    // factory method: gets rid of a single Factory class.
        // we can create however many subclasses that represent Factories. 
        // extend this class for more options!
    public abstract Attraction createAttractionFactory();
}
