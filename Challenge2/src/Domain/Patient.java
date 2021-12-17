/** * (Use Javadoc tags to document your code too. *
 *  * @author 6187002 *
 *  *  Title:            Challenge 2*
 *  * Semester:         COP3804 - Fall 2022*
 *  Professor's Name: Prof. Charters*
 *  Description of Program’s Functionality: This class keeps a record of vaccination patients  *
 *  */
package Domain;

public class Patient {
    // record fields
    private String firstName,lastName,birthDate;
    private CoronaVaccine vaccine;

    /** * Construtor function  *
     * * String firstName- first name of patient
     * , String lastName- last name of patient
     * String birthDate- birth date of patient
     * CoronaVaccine vaccine - record of vaccination
     *   * @return returns a new patient object *
      */
    public Patient(String firstName, String lastName, String birthDate, CoronaVaccine vaccine) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.vaccine = vaccine;
    }


    public String getFirstName() {
        return firstName;
    }


    public String getLastName() {
        return lastName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public CoronaVaccine getVaccine() {
        return vaccine;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public void setVaccine(CoronaVaccine vaccine) {
        this.vaccine = vaccine;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", vaccine=" + vaccine +
                '}';
    }
}
