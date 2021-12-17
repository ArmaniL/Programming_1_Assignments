import java.io.*;
import java.nio.file.Path;
import java.util.Scanner;
/**
 *@author 6187002
 *title:             FIU student registration with added file capabilites
 *
 *semester:          COP2210 - Fall 2021
 *professor's name:  Christy Charters
 *Description of programs functionality:  This program ask the user how many students they will be creating.
 *                                        The program will then define an array of that size, and
 *                                        will create a loop that will run that many times. The program gets input from a file called
 *                                        student.txt and writes to a file called student report
 */
public class FIURegistrar
{
    /**
     * main calls two methods createArrayOfStudents() and processArrayOfStudents()
     * @param args
     */
    public static void main(String[] args) throws IOException {
        Student[] FIUStudents = createArrayOfStudents();
        processArrayOfStudents(FIUStudents);
    }

    /**
     * the purpose of this method is to create an array of students and return that array to main
     * @return
     */
    private static Student[] createArrayOfStudents() throws FileNotFoundException {
        Path fileName = Path.of("student.txt");
        File inputFile = new File(fileName.toString());
        Scanner input = new Scanner(inputFile);
        String userReply = "yes";
        System.out.println("How many Students are we adding to the database?");
        int numOfStudent = new Scanner(System.in).nextInt();
        Student[] FIUPanthers = new Student[numOfStudent];

        String firstName, lastName;
        int PID;
        double GPA;
        Student aStudent;
        int i = 0;

        while (i < FIUPanthers.length && input.hasNextLine())
        {
            String line = input.nextLine();
            Scanner sc = new Scanner(line);
            firstName = sc.next();
            lastName = sc.next();
            PID = sc.nextInt();
            GPA = sc.nextDouble();

            aStudent = new Student(firstName, lastName, PID, GPA);

            FIUPanthers[i] = aStudent;
            i++;
        }

        return FIUPanthers;
    }

    /**
     *This method determines which student has the highest and lowest GPA as well as calculates the average GPA
     * @param FIUStudent
     */
    private static void processArrayOfStudents(Student[] FIUStudent) throws IOException {
        double min = FIUStudent[0].getGPA();
        double max = FIUStudent[0].getGPA();
        double sumOfGPA = 0;
        double avgGPA;
        int locOfLowestGPA = 0;
        int locOfHighestGPA = 0;

        for (int i = 0; i < FIUStudent.length; i++)
        {
            if(FIUStudent[i].getGPA() <= min)
            {
                min = FIUStudent[i].getGPA();
                locOfLowestGPA = i;
            }
            if(FIUStudent[i].getGPA() >= max)
            {
                max = FIUStudent[i].getGPA();
                locOfHighestGPA = i;
            }
            sumOfGPA += FIUStudent[i].getGPA();
            System.out.println(FIUStudent[i].toString());
        }
        avgGPA = sumOfGPA/ FIUStudent.length;

        System.out.printf("Average GPA: %.2f\n", avgGPA);
        System.out.println("The student with the Highest GPA is: " + FIUStudent[locOfHighestGPA]);
        System.out.println("The student with the lowest GPA is: " + FIUStudent[locOfLowestGPA]);

        Path fileName = Path.of("StudentReport.txt");

        PrintWriter pw = new PrintWriter(new FileWriter(fileName.toString(),true));
        pw.printf("Average GPA: %.2f\n", avgGPA );
        pw.println("The student with the Highest GPA is: " + FIUStudent[locOfHighestGPA]);
        pw.println("The student with the lowest GPA is: " + FIUStudent[locOfLowestGPA]);
        pw.close();

    }
}
