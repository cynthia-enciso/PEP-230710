package a_encapsulation.a_accessmodifiers.b_examplepackage2;

public class Parent {
    
    // state
    public String pub; // most accessible
    protected String pro;
    String def;
    private String pri; // least accessible

    public void useState() {
        System.out.println(pub);
        System.out.println(pro);
        System.out.println(def);
        System.out.println(pri);
    }
}
