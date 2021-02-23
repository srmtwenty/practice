public class FizzBuzz{
    // public String fizzBuzz(String number, int numberTwo){
    //     if(number % 3 ==0 && number % 5 == 0){
    //         return "FizzBuzz";
    //     }
    //     if(num % 3 ==0){
    //         return "Fizz";
    //     }
    //     if(num % 5 ==0){
    //         return "Buzz";
    //     }

    //     else {
    //         return numberTwo;
    //     }
    // }
    public String fizzBuzz(int num){
        if(num %3 ==0 && num % 5==0){
            return "FizzBuzz";
        }
        else if(num %3 ==0){
            return "Fizz";
        }
        else if(num %5 == 0){
            return "Buzz";
        }
        
        else{
            return (Integer.toString(num));
        }
    }
}