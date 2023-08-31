package designpatterns.a_nofactory;

import designpatterns.a_nofactory.districts.District;

public class App {
    public static void main(String[] args) {
        District district = new District();
        district.setUp("general");
    }
}
