import java.util.ArrayList;

public class BasicJava{
    public static void print255(){
        for(int i=0; i<256; i++){
            System.out.println(i);
        }
    }
    public static void printOdd(){
        for(int i=1; i<266; i+=2){
            System.out.println(i);
        }
    }

    public static void printSum(){
        int sum = 0;
        for(int i=0; i<256; i++){
            
            sum+=i;
            // System.out.println("New number: "+i +" Sum: "+ sum);
            System.out.println(String.format("New number: %d Sum: %d", i, sum));
        }
    }

    public static void iterate(int [] x){
        for(Integer number: x){
            System.out.println(number);
        }
    }

    public static void printMax(int [] x){
        int max = x[0];
        for(Integer num: x){
            if(max < num){
                max = num;
            }
        }
        System.out.println("Max num"+ max);
    }

    public static void getAverage(int [] x){
        int sum =0;
        for(Integer num: x){
            sum+=num;
        }
        System.out.println(sum /x.length);

    }
    public static void oddArray(){
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=1; i<256; i+=2){
            list.add(i);
        }
        System.out.println(list);
    }

    public static void greaterThanY(int [] x, int y){
        int number =0;
        for(int i=0; i<x.length; i++){
            if(x[i] > y){
                number+=1;
            }
            
        }System.out.println("Number of greater value: " +number);
    }

    public static void squareValues(int [] x){
        for(int i=0; i<x.length; i++){
            x[i]=x[i] * x[i];
        }
    }

    public static void eliminate(int [] x){
        for(int i=0; i<x.length; i++){
            if(x[i] <0){
                x[i] = 0;
            }       
        }
    }

    public static Object[] maxMinAvg(int [] x){
        int sum =0;
        int max =x[0];
        int min =x[0];
        for(Integer num: x){
            sum += num;
            if(num>max){
                max = num;
            }
            else if(num<min){
                min = num;
            }
        }
        double avg = (double)sum/x.length;
        Object [] newArr = {max, min, avg};
        return newArr;
        
        
    }

    public static void shiftArray(int [] x){
        for(int i=0; i<x.length-1;i++){
            x[i] = x[i+1];

        }
        x[x.length-1] =0;
        
    }
}