package designpatterns.b_simplefactoryandsingleton;

import designpatterns.b_simplefactoryandsingleton.districts.District;

public class App {
    public static void main(String[] args) {
        Announcement.getAnnouncement().printMessage("Theme park is opening!");
        District district = new District();
        district.setUp("kid");
        
    }
}
