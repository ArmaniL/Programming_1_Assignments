/** * (Use Javadoc tags to document your code too. *
 *  * @author 6187002 *
 *  *  Title:            Challenge 2*
 *  * Semester:         COP3804 - Fall 2022*
 *  Professor's Name: Prof. Charters*
 *  Description of Program’s Functionality: This class keeps a record of CoronaVirus vaccines *
 *  */
package Domain;

public class CoronaVaccine {
    private String manufacturer;

    @Override
    public String toString() {
        return "CoronaVaccine{" +
                "manufacturer='" + manufacturer + '\'' +
                ", firstLocation='" + firstLocation + '\'' +
                ", firstShotDate='" + firstShotDate + '\'' +
                ", secondLocation='" + secondLocation + '\'' +
                ", secondShotDate='" + secondShotDate + '\'' +
                ", numDoses=" + numDoses +
                '}';
    }
    // vaccination fields
    private String firstLocation;
    private String firstShotDate;
    private String secondLocation;
    private String secondShotDate;
    private int numDoses;


    public CoronaVaccine(String manufacturer, String firstLocation, String firstDate, String secondLocation, String secondDate, int numDoses) {
        this.manufacturer = manufacturer;
        this.firstLocation = firstLocation;
        this.firstShotDate = firstDate;
        this.secondLocation = secondLocation;
        this.secondShotDate = secondDate;
        this.numDoses = numDoses;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getFirstLocation() {
        return firstLocation;
    }

    public String getFirstDate() {
        return firstShotDate;
    }

    public String getSecondLocation() {
        return secondLocation;
    }

    public String getSecondDate() {
        return secondShotDate;
    }

    public int getNumDoses() {
        return numDoses;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setFirstLocation(String firstLocation) {
        this.firstLocation = firstLocation;
    }

    public void setFirstDate(String firstDate) {
        this.firstShotDate = firstDate;
    }

    public void setSecondLocation(String secondLocation) {
        this.secondLocation = secondLocation;
    }

    public void setSecondDate(String secondDate) {
        this.secondShotDate = secondDate;
    }

    public void setNumDoses(int numDoses) {
        this.numDoses = numDoses;
    }
}
