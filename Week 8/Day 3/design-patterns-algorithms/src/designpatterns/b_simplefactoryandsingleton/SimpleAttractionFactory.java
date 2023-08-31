package designpatterns.b_simplefactoryandsingleton;

import designpatterns.b_simplefactoryandsingleton.attractions.*;

public class SimpleAttractionFactory {

    public static Attraction createAttraction(String type) {
        if (type.equals("kid")) {
            return new TeacupSpin();
        } else if (type.equals("general")) {
            return new LoopyCoaster();
        } else if (type.equals("water")) {
            return new WaterSlideExtreme();
        }

        return null;
    }
}
