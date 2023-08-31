package designpatterns.b_simplefactoryandsingleton.districts;

import designpatterns.b_simplefactoryandsingleton.Announcement;
import designpatterns.b_simplefactoryandsingleton.SimpleAttractionFactory;
import designpatterns.b_simplefactoryandsingleton.attractions.*;

public class District {
    
    // client code
    public void setUp(String type) {

        
        // create an attraction based off of type of district
        Attraction attraction = SimpleAttractionFactory.createAttraction(type);
        
        // perform set up operations
        attraction.turnOn();
        attraction.test();
        attraction.allowEntry();

        Announcement announcement = Announcement.getAnnouncement();
        announcement.printMessage("District is set up!");
    }
}
