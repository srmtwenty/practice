public class HiWorldTest{
    public static void main(String [] args){
        HiWorld hw = new HiWorld();
        String greetWithName = hw.greeting("Paul");
        String greet = hw.greeting();
        if (greet.equals("Hi World") || greetWithName.equals("Hi Paul")){
            System.out.println(greet);
            
            System.out.println("Successful!");
        }
        else{
            System.out.println("Unsuccessful!");
        }
    }
}