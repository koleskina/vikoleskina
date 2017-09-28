package ru.job4j.oop;
/**
 * Teacher.
 **/
public class Teacher extends Profession {
    /*** @param discipline.*/
    private String discipline = new String();
    /*** @param school.*/
    private int  school;
    /*** Teacher.**/
    public Teacher() {
    }

    /*** Teacher.
     * @param name name
     * @param institute institute
     * @param yearOfIssue yearOfIssue
     * @param city  city
     * @param workExperience workExperience
     * @param discipline discipline
     * @param school school
     */
    public Teacher(String name, String institute, int yearOfIssue, String city, int workExperience, String discipline,  int school) {
        super(name, institute, yearOfIssue, city, workExperience);
        this.discipline = discipline;
        this.school =  school;
    }
    /**
     *  @param doc doc
     * @return return return
     */
    public String teach(Doctor doc) {
        String tea = "Учитель " + getName() + " обучает " + doc.getName();
        return tea;
    }
}

