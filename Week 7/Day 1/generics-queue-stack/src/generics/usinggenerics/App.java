package generics.usinggenerics;

import generics.usinggenerics.food.Burrito;
import generics.usinggenerics.food.Food;
import generics.usinggenerics.food.Sandwich;

public class App {
    public static void main(String[] args) {
        Container<String> myContainer = new Container<>();
        myContainer.setItem("hello world");
        // myContainer.setItem(5);

        Tupperware<Food> myGeneralTupperware = new Tupperware<>();
        myGeneralTupperware.setItem(new Burrito());
        myGeneralTupperware.setItem(new Sandwich());
        // myGeneralTupperware.setItem("hello world"); // fails

        Tupperware<Sandwich> mySandwichTupperware = new Tupperware<>();
        // can't put burrito in sandwich tupperware
        // mySandwichTupperware.setItem(new Burrito()); 
        mySandwichTupperware.setItem(new Sandwich());
    }
}
