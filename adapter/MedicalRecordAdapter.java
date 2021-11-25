/**
 * @author Patrick Burroughs
 * Portia Plante 247 Section 002
 * Adapter Design Pattern
 */

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Modifies a patient's health record into a more readable medical record format
 */
public class MedicalRecordAdapter implements MedicalRecord {
    
    HealthRecord record;
    ArrayList<Visit> visitHistory  = new ArrayList<Visit>();

    public MedicalRecordAdapter(HealthRecord record) {
        this.record = record;
        //if this.record.getHistory().size()
    }

    /**
     * Gets first name of patient
     * @return first name of patient
     */
    public String getFirstName() {
        String fullName = this.record.getName();
        String firstName = "";
        for (int i = 0; i < fullName.length(); i++) {
            firstName += fullName.charAt(i);
            if (fullName.indexOf(" ") == i) {
                i = fullName.length();
            }
        }
        return firstName;
    }

    /**
     * Gets last name of patient
     * @return last name of patient
     */
    public String getLastName() {
        String fullName = this.record.getName();
        String lastName = "";
        boolean spaced = false;
        for (int i = 0; i < fullName.length(); i++) {
            if (spaced) {
                lastName += fullName.charAt(i);
            }
            if (fullName.indexOf(" ") == i) {
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
        return this.record.getBirthdate();
    }

    /**
     * Gets gender of patient
     * @return gender
     */
    public Gender getGender() {
        String strGender = this.record.getGender();
        if (strGender.equalsIgnoreCase("MALE")) {
            return Gender.MALE;
        }
        else if (strGender.equalsIgnoreCase("FEMALE")) {
            return Gender.FEMALE;
        }
        else {
            return Gender.OTHER;
        }
    }

    /**
     * Adds another visit to the patient's history
     * @param date date of visit
     * @param well if the patient was doing well
     * @param description comments on the patients condition
     */
    public void addVisit(Date date, boolean well, String description) {
        Visit visit = new Visit(date, well, description);
        visitHistory.add(visit);
    }

    /**
     * Gets entire visit history of the patient
     * @return list of patient's visits
     */
    public ArrayList<Visit> getVisitHistory() {
        return visitHistory;
    }

    /**
     * Compiles patient's information into a readable string
     */
    public String toString() {
        String gender = "";
        String returned = "";

        if (this.getGender() == Gender.MALE) {
            gender = "Male";
        }
        else if (this.getGender() == Gender.FEMALE) {
            gender = "Female";
        }
        else {
            gender = "Other";
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");
        returned = "***** " + this.getFirstName() + this.getLastName() + " *****\nBirthday: " + simpleDateFormat.format(this.getBirthday()) +
        "\nGender: " + gender + "\nMedical Visit History: \n";

        String histDate = "";
        String histWell = "";
        String histComments = "";
        String currentHist = "";

        for (int i = 0; i < this.record.getHistory().size(); i++) {
            histDate = "";
            histWell = "";
            histComments = "";
            currentHist = this.record.getHistory().get(i);
                    histDate += currentHist.charAt(15);
                    histDate += currentHist.charAt(16) + "/";
                    histDate += currentHist.charAt(11);
                    histDate += currentHist.charAt(12) + "/";
                    histDate += currentHist.charAt(19);
                    histDate += currentHist.charAt(20);
                    histDate += currentHist.charAt(21);
                    histDate += currentHist.charAt(22) + ": ";
                
                    if (currentHist.charAt(36) ==  't') {
                        histWell = "Well Visit, ";
                        histComments = currentHist.substring(51, currentHist.length()-1) + "\n";
                    }
                    else {
                        histWell = "Sick Visit, ";
                        histComments = currentHist.substring(52, currentHist.length()-1) + "\n";
                    }
                    returned += histDate + histWell + histComments;
        }

        for (int i = 0; i < visitHistory.size(); i++) {
            returned += simpleDateFormat.format(visitHistory.get(i).getDate()) + ": ";
            if (visitHistory.get(i).isWell()) {
                returned += "Well Visit, ";
            }
            else {
                returned += "Sick Visit, ";
            }
            returned += visitHistory.get(i).getDescription() + "\n";
        }
        return returned;
    }
}
