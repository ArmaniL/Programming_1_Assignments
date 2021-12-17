import java.util.Scanner;

public class ExtraCredit {

    public static void main(String[] args) {
    question1();
    question2(16);
    question3(21);
    question4();
    question5();
    question6();
    question7();
    question8();
    question9();
    question10();
    question11();
    question12("Apple");
    }

    private static void question11() {


                for (int rows =1;rows<6;rows++){

                    for(int cols =rows;cols>0;cols--){
                        System.out.print('*');
                    }
                    System.out.println();
                }

            }



    private static void question10() {
        for (int i = 2; i<6;i++){
            for(int j = 0;j<13;j++){
                System.out.printf(" %d x %d = %d\n",i,j,i*j);
            }
        }
    }

    private static void question9() {

        for (int i =-20;i<51;i++){System.out.println(i);}
    }

    private static void question8() {
        int i;
        for ( i =0;i<10;i++){
            System.out.println(i*2);
        }
        System.out.println(i);

    }

    private static void question7() {
        Scanner sc = new Scanner(System.in);
        int sumOfOdds =0;
        int input ;
        do {
            System.out.println("Enter odd");
            input = sc.nextInt();
            if (input %2 != 0){
                sumOfOdds+=input;
            }}while(input != -1);
        System.out.println(sumOfOdds);

    }

    private static void question6() {
        for (int num =100;num>-1;num-=2){
            System.out.println(num);
        }
    }

    private static void question5() {
        //3
    }

    private static void question4() {
        // infinte loop
    }

    private static void question3(int age ) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age");
         age = sc.nextInt();
        while (age <16){
            System.out.println("Age has to be 16");
             age = sc.nextInt();
        }
    }

    private static void question12(String s) {
      System.out.println(encryptMe(s));
    }

    static String encryptMe(String s){
        String result = "";
        for (int i =0;i<s.length();i++){
            char  c = (char)(s.charAt(i)-20);

            result+=c;
        }
        return result.toString();
    }

    private static void question2(int age ) {
        String message ;
        if (age >21){
            message = "You can drink,drive and vote";
        } else if (age > 18){
            message = "You can drive and vote";
        }
        else if (age >16){
            message = "You can drive";
        }
        else {
            message = "You cant do anything ";
        }

        System.out.println(message);
    }

    private static void question1() {
        int age =18;
        if (age >21){
            System.out.println("You can drink,drive and vote");
        } else if (age > 18){
            System.out.println("You can drive and vote");
        }
        else if (age >16){
            System.out.println("You can drive");
        }
        else {
            System.out.println("You cant do anything ");
        }
    }

}
