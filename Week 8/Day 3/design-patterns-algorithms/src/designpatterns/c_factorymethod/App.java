package designpatterns.c_factorymethod;

import designpatterns.c_factorymethod.districts.District;
import designpatterns.c_factorymethod.districts.KidDistrict;
import designpatterns.c_factorymethod.districts.WaterDistrict;

public class App {
    public static void main(String[] args)  {
        District newDistrict = new WaterDistrict();
        newDistrict.setUp();

        newDistrict = new KidDistrict();
        newDistrict.setUp();
    }
}
