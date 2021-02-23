import java.util.ArrayList;
public class Loops1{
    public static void main(String [] args){
        for(int i=0; i<7; i++){
            System.out.println(i);
        }
        ArrayList<String> dynamicArray = new ArrayList<String>();
            dynamicArray.add("hello");
            dynamicArray.add("world");
            dynamicArray.add("etc");
            for (int i = 0; i < dynamicArray.size(); i++){
                System.out.println(dynamicArray.get(i));
        }
        for(int i = 0; i < dynamicArray.size(); i++){
            String name = dynamicArray.get(i);
            System.out.println("hello " + name);
            // other operations using name
        }

        for(String name : dynamicArray){
            System.out.println("hello " + name);
            // other operations using name
        }
    }
}