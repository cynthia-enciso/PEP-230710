package a_encapsulation.a_accessmodifiers.a_examplepackage1;

import a_encapsulation.a_accessmodifiers.b_examplepackage2.Parent;

public class Unrelated2 {
    public void useState() {
        Parent parentObj = new Parent();
        System.out.println(parentObj.pub);
        // System.out.println(parentObj.pro);
        // System.out.println(parentObj.def);
        // System.out.println(parentObj.pri);
    }
}
