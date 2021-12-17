package driver;

public class FizzBuzz {
    public static void main(String[] args) {
        fizzBuzz();
    }

    public static  void fizzBuzz(){
        for(int i =1;i<101;i++){
            if(i % 15 == 0){
                System.out.printf("fizz buzz %f\n",Math.pow(i/3+i/5,2));
            }else if(i % 5 == 0){
                System.out.println("buzz");
            }
            else if(i%3 == 0){
                System.out.println("fizz");
            }
            else{
                System.out.println(i);
            }
        }
    }
}
