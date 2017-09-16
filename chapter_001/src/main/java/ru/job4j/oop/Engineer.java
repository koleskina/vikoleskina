package ru.job4j.oop;
/**
 * Engineer.
 **/
public class Engineer extends Profession {
    /*** @param category.*/
    private int category;
    /*** @param department.*/
    private String department = new String();
    /*** Engineer.*/
    public Engineer() { //пустой конструктор
    }
    /*** Engineer.
     * @param name name
     * @param institute institute
     * @param yearOfIssue yearOfIssue
     * @param city city
     * @param workExperience workExperience
     * @param category category
     * @param department department
     */
    public Engineer(String name, String institute, int yearOfIssue, String city, int workExperience, int category, String department) {
        super(name, institute, yearOfIssue, city, workExperience);
        this.category = category;
        this.department = department;
    }
    /**
     *  @param te te
     * @return return return
     */
    public String instruct(Teacher te) {
        String ins =  "Инженер " + this.getName() + " инструктирует " + te.getName();
        return ins;
    }
}



