package com.revature;

import com.revature.controller.PetController;

public class App {

    public static void main( String[] args ) {
        PetController controller = new PetController();
        controller.setUpAPI();
    }

}
