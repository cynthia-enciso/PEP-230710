package generics.usinggenerics;

import generics.usinggenerics.food.Food;

public class Tupperware<T extends Food> extends Container<T> {
    // <T extends Food>
    // specify the type that tupperware can use


    // Tupperware extends Container<T>
    // this class must be generic like Container and has container state and behavior
}
