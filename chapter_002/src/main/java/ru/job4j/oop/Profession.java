/** @author Viktoria Koleskina (mailto:viktoriakoleskina@yandex.ru)
* @version $Id$
* @since 0.1**/
package ru.job4j.oop;
/**
* Realize Professions.
**/
public abstract class Profession {
    /*** @param name.*/
    private String name = new String();
    /*** @param institute.*/
    private String institute = new String();
    /*** @param yearOfIssue.*/
    private int yearOfIssue;
    /*** @param city.*/
    private String city = new String();
    /*** @param country.*/
    private String country = new String();
    /*** @param workExperience.*/
    private int workExperience;
    /*** Profession.*/
    public Profession() {

    }
    /*** Profession*/
    /**
     *  @param name name
     *  @param institute institute
     *  @param yearOfIssue yearOfIssue
     *  @param city city
     *  @param workExperience workExperience
     */
    public Profession(String name, String institute, int yearOfIssue,  String city, int workExperience) {
        this.name = name;
        this.institute = institute;
        this.yearOfIssue = yearOfIssue;
        this.city = city;
        this.country = country;
        this.workExperience = workExperience;
    }
    /*** getName.
     * * @return return return
     */
    public String getName() {
        return this.name;
    }
    /*** getInstitute.
     * * @return return return*/
    public String getInstitute() {
        return this.institute;
    }
    /*** getCity.
     * * @return return return*/
    public String getCity() {
        return this.city;
    }
    /*** getWorkExperience.
     * * @return return return*/
    public int getWorkExperience() {
        return this.workExperience;
    }
}

