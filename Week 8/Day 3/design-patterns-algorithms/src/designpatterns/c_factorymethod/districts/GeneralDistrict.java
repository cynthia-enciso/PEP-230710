package designpatterns.c_factorymethod.districts;

import designpatterns.c_factorymethod.attractions.Attraction;
import designpatterns.c_factorymethod.attractions.LoopyCoaster;

public class GeneralDistrict extends District {

    @Override
    public Attraction createAttractionFactory() {
        return new LoopyCoaster();
    }
    
}
