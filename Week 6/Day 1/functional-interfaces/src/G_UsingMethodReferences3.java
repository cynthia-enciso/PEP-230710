import java.util.List;
import java.util.stream.Collectors;

public class G_UsingMethodReferences3 {
    public static void main(String[] args) {
         // example of actual use case of constructor reference
        List<String> catNames = List.of("Barry", "Chocolate", "Patricia");

        List<Cat> cats = catNames.stream().map(Cat::new).collect(Collectors.toList());
        System.out.println(cats);

        // example of actual use case of arbitrary object reference
        List<String> myStrings = List.of("potato", "broccoli", "brussel sprouts");
        List<String> myUpperCaseStrings1 = myStrings.stream().map(String::toUpperCase).collect(Collectors.toList());
        List<String> myUpperCaseStrings2 = myStrings.stream().map(string -> string.toUpperCase()).collect(Collectors.toList());
        System.out.println(myUpperCaseStrings1);
    }
}

class Cat {
    String name;

    Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat {name=" + name + "}";
    }

    
}