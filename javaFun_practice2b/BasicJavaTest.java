import java.util.Arrays;
public class BasicJavaTest{
    public static void main(String [] args){
        BasicJava bj = new BasicJava();
        bj.print255();

        bj.printOdd();
        bj.printSum();

        int [] myArray={1,3,5,7,9, 13};
        bj.iterate(myArray);

        int [] myArr = {-3, -5, 0, 5, 1};
        bj.printMax(myArr);

        int [] myAvg = {2, 10, 3};
        bj.getAverage(myAvg);

        bj.oddArray();

        int [] myA = {1, 3, 5, 7};
        int y = 3;
        bj.greaterThanY(myA, y);

        int [] myA2={1, 5, 10, -2};
        bj.squareValues(myA2);
        System.out.println(java.util.Arrays.toString(myA2));

        bj.eliminate(myArr);
        System.out.println(java.util.Arrays.toString(myArr));
    
        int [] myA3={1,5,10,-2};
        // bj.maxMinAvg(myA3);
        System.out.println(java.util.Arrays.toString(bj.maxMinAvg(myA3)));


        int [] myA4={1, 5, 10, 7, -2};
        // bj.shiftArray(myA4);
        System.out.println(java.util.Arrays.toString(myA4));
    }
    
}