/**
 * @author Patrick Burroughs
 * Portia Plante 247 Section 002
 * Adapter Design Pattern
 */

import java.text.SimpleDateFormat;

/**
 * Modifies a patient's health record into a more readable medical record format
 */
public class MedicalRecordAdapter {
    
    record HealthRecord;

    public MedicalRecordAdapter(HealthRecord record) {
        this.HealthRecord = record;
    }

    /**
     * Gets first name of patient
     * @return first name of patient
     */
    public String getFirstName() {
        String fullName = this.HealthRecord.getName();
        String firstName;
        for (int i = 0; i < fullName.length(); i++) {
            firstName += fullName.indexOf(i);
            if (fullName.indexOf(i) == " ") {
                i = fullName.length();
            }
        }
        return lastName;
    }

    /**
     * Gets last name of patient
     * @return last name of patient
     */
    public String getLastName() {
        String fullName = this.HealthRecord.getName();
        String lastName;
        boolean spaced = false;
        for (int i = 0; i < fullName.length(); i++) {
            if (spaced) {
                lastName += fullName.indexOf(i);
            }
            if (fullName.indexOf(i) == " ") {
                spaced = true;
            }
        }
        return lastName;
    }

    /**
     * Gets birthdate of patient
     * @return birthdate
     */
    public Date getBirthday() {
        return this.HealthRecord.getBirthdate();
    }

    /**
     * Gets gender of patient
     * @return gender
     */
    public Gender getGender() {
        return this.HealthRecord.getGender();
    }

    /**
     * Adds another visit to the patient's history
     * @param date date of visit
     * @param well if the patient was doing well
     * @param description comments on the patients condition
     */
    public void addVisit(Date date, boolean well, String description) {
        Visit visit = new Visit(date, well, description);
        
        
    }

    /**
     * Gets entire visit history of the patient
     * @return list of patient's visits
     */
    public ArrayList<Visit> getVisitHistory() {

    }

    /**
     * Compiles patient's information
     */
    public String toString() {
        return "***** " + this.getFirstName() + this.getLastName() + " *****\nBirthday: ";
    }
}
