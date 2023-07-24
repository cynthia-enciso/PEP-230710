package a_encapsulation.a_accessmodifiers.a_examplepackage1;

import a_encapsulation.a_accessmodifiers.b_examplepackage2.Parent;

public class Child extends Parent {
    
    public void useState() {
        System.out.println(pub);
        System.out.println(pro);
        // System.out.println(def);
        // System.out.println(pri);
    }
}
