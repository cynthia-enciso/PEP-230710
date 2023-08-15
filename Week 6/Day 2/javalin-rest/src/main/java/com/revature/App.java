package com.revature;

public class App {

    public static Database db = new Database();
    public static void main(String[] args) {
        // create and initalize database
        db.init();

        // create controller
        Controller controller = new Controller();
        controller.setUp();
    }
}
