package com.revature;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.revature.controller.PetController;

public class App {
    
        // create logger to start writing messages
        static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main( String[] args ) {
        logger.info("application started!!!!!");
        PetController controller = new PetController();
        controller.setUpAPI();
    }

}
