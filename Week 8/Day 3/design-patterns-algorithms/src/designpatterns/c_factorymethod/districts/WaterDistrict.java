package designpatterns.c_factorymethod.districts;

import designpatterns.c_factorymethod.attractions.Attraction;
import designpatterns.c_factorymethod.attractions.WaterSlideExtreme;

public class WaterDistrict extends District {
    @Override
    public Attraction createAttractionFactory() {
        return new WaterSlideExtreme();
    }
    
}
