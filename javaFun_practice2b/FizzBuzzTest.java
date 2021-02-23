public class FizzBuzzTest{
    public static void main(String[] args){

        FizzBuzz fiz = new FizzBuzz();
        // int resul = fiz.fizzBuzz(6);
        // int result2 = fiz.fizzBuzz(10);
        // int result3 = fiz.fizzBuzz(15);
        int result4 = Integer.parseInt(fiz.fizzBuzz(7));

        System.out.println(fiz.fizzBuzz(6));
        System.out.println(fiz.fizzBuzz(10));
        System.out.println(fiz.fizzBuzz(15));
        System.out.println(result4);
    }
}