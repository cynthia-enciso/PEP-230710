package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;

@SuppressWarnings("unchecked")
public class UsingReflection {
    public static void main(String[] args) throws Exception {
        // get Class object
        Class<Database> databaseClass = Database.class;

        // print class member information
        System.out.format("Class:%n  %s%n%n", databaseClass.getSimpleName());
        printMembers(databaseClass.getDeclaredMethods(), "Methods");
        printMembers(databaseClass.getDeclaredConstructors(), "Constructors");
        printMembers(databaseClass.getDeclaredFields(), "Fields");

        // work with specific members (a method and a field)
        Method specificMethod = databaseClass.getDeclaredMethod("addFoodItem", FoodItem.class);

        Database db = new Database();
        specificMethod.invoke(db, new FoodItem("Hoagie", 2.99));

        Field specificField = databaseClass.getDeclaredField("data");
        specificField.setAccessible(true); // accessing private member

        // get() returns value of the Object type, must downcast
        ArrayList<FoodItem> foodItems = (ArrayList<FoodItem>) specificField.get(db);
        System.out.println(foodItems);
    }

    public static void printMembers(Member[] mbrs, String s) {
System.out.format("%s:%n", s);
        
        // downcast from supertype to subtype in order to get subtype specific method (toGenericString)
        for (Member mbr : mbrs) {
            if (mbr instanceof Field) {
                System.out.format("  %s%n", ((Field)mbr).toGenericString());
            } else if (mbr instanceof Constructor) {
                System.out.format("  %s%n", ((Constructor<Database>)mbr).toGenericString()); // no args

            } else if (mbr instanceof Method) {
                System.out.format("  %s%n", ((Method)mbr).toGenericString());   
            } 
        }

        // add newline
        System.out.format("%n");
    }
}
