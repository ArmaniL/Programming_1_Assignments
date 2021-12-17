public class Student
        /**
         * This class creates a student object consisting of a first name, last name, PID, and GPA
         */
{
    private String firstName;
    private String lastName;
    private int pantherID;
    private double GPA;


    public Student(String firstName, String lastName, int pantherID, double GPA)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pantherID = pantherID;
        this.GPA = GPA;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPantherID() {
        return pantherID;
    }

    public void setPantherID(int pantherID) {
        this.pantherID = pantherID;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public String toString() {
        return lastName + ", " + firstName + "\n" +
                "Panther ID: " + pantherID + "\n" +
                "GPA:        " + GPA +"\n";
    }
}
