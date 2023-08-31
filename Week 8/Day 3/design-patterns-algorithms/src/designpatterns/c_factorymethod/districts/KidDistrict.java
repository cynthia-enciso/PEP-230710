package designpatterns.c_factorymethod.districts;

import designpatterns.c_factorymethod.attractions.Attraction;
import designpatterns.c_factorymethod.attractions.TeacupSpin;

public class KidDistrict extends District{
    
    @Override
    public Attraction createAttractionFactory() {
        return new TeacupSpin();
    }
}
