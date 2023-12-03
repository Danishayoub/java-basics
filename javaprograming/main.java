import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        
        List<String> myArrayList = new ArrayList<>();

        
        myArrayList.add("Hello");
        myArrayList.add("World");
        myArrayList.add("!");

        System.out.println("Element at index 0: " + myArrayList.get(0));

    
        for (String element : myArrayList) {
            System.out.println(element);
        }
    }
}






