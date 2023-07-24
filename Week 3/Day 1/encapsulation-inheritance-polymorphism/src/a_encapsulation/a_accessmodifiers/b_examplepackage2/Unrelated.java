package a_encapsulation.a_accessmodifiers.b_examplepackage2;

public class Unrelated {
    public void useState() {
        Parent parentObj = new Parent();
        System.out.println(parentObj.pub);
        System.out.println(parentObj.pro);
        System.out.println(parentObj.def);
        // System.out.println(parentObj.pri);
    }
}
