import java.util.Scanner;
public class MadLibs {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How old are you");
        int age = input.nextInt()+10;
        input.nextLine();
        System.out.println("What is your favorite Food");
        String favFood = input.nextLine();
        System.out.println("What is your favorite Song");
        String favSong = input.nextLine();
        System.out.println("What is your favorite Color");
        String favColor = input.nextLine();
        System.out.println("What is your favorite Movie");
        String favMovie = input.nextLine();
        System.out.println("What is your favorite Sport");
        String favSport = input.nextLine();

        System.out.println("Favoruite food to eat on special occasions is "+favFood);
        System.out.println("Favoruite Song  is  "+favSong);
        System.out.println("Who doesnt like  "+favColor + '?');
        System.out.println("What Movie is   "+favMovie);
        System.out.println("In Highshool I did  "+favSport + '!');
        System.out.println("In 10 years, you will be "+age+
                " years old ");

    }

}
