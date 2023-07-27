package com.revature;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Checklist myList = new Checklist();
        myList.createTask("exercise");
        myList.createTask("do laundry");
        myList.createTask("eat dinner");
        myList.removeTask("exercise");
        myList.toggleTask("do laundry");
        System.out.println(myList);
    }
}
