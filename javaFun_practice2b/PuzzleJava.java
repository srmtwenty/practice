import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class PuzzleJava{
    public static void main(String [] args){
        int [] arr1 = {3,5,1,2,7,9,8,13,25,32};
            System.out.println(sumAndGreater(arr1)); 
    
        String [] arr2 = {"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};
            System.out.println(shuffle(arr2));
        }

    public static ArrayList<Integer> sumAndGreater(int [] x){
        int sum =0;
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        for(int i=0; i<x.length; i++){
            sum+=x[i];
            if(x[i]>10){
                numbers.add(x[i]);
                
            }
        }
        System.out.print("Sum: " + sum);
        return (numbers);
    }

    public static ArrayList<String> shuffle(String [] shuffleArray){
        ArrayList<String> newArr = new ArrayList<String>();
        for(String name : shuffleArray){
            
            newArr.add(name);
        }
        Collections.shuffle(newArr);

        ArrayList<String> names = new ArrayList<String>();
        for(String name: shuffleArray){
            System.out.println(name);
            if(name.length()>5){
                
                names.add(name);
            }
            
        }
        
        return names;
    }
}