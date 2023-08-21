package generics;

class Container {

    private Object item;

    public Object getItem() {
        return item;
    }

    public void setItem(Object item) {
        this.item = item;
    }
}

class Dog {}

public class NoGenerics {
    public static void main(String[] args) {
        Container myContainer = new Container();
        myContainer.setItem(new Dog());
        myContainer.setItem("hello world");
        myContainer.setItem(5);
        String myString = (String)myContainer.getItem();
        System.out.println(myString.charAt(0));
    }
}
