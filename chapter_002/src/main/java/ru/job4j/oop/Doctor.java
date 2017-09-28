package ru.job4j.oop;
/**
 * Doctor.
 **/
public class Doctor extends Profession {
    /*** @param specialization.*/
    private String specialization = new String();
    /*** @param license.*/
    private int license;
    /*** Doctor.**/
    public Doctor() { //пустой контруктор
    }
    /*** Doctor.
     *  @param name name
     *  @param institute institute
     *  @param yearOfIssue yearOfIssue
     *  @param city city
     *  @param workExperience workExperience
     *  @param specialization specialization
     *  @param license license
     */
    public Doctor(String name, String institute, int yearOfIssue, String city, int workExperience, String specialization, int license) {
        super(name, institute, yearOfIssue, city, workExperience);
        this.specialization = specialization;
        this.license = license;
    }
    /**
     *  @param en en
     * @return return return
     */
    public String medicate(Engineer en) {
        String med = "Доктор " + this.name + " лечит " + en.getName();
        return med;
    }
}

