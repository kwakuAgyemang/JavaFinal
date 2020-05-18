/**
 * @author - Kwaku Ofosu-Agyeman
 * @version - 1.0.1
 */

public class Student {
    /**
     * Instance Variables
     */
    private String name;
    private int age;
    private String ID;
    protected static boolean isGhanaian;
    private boolean status;

    /**
     * Default Constructor
     */
    Student(){}

    /**
     * Overloaded constructor
     * @param name
     * @param age
     * @param ID
     */
    Student(String name, int age, String ID){
        this.name = name;
        this.age = age;
        this.ID = ID;
        this.isGhanaian = false;
    }

    /**
     * Sets the age of the student
     * @param age
     */
    public void setAge(int age){
        this.age = age;
    }

    /**
     * Returns the age of the student
     * @return int: age
     */
    public int getAge(){
        return this.age;
    }

    /**
     * Sets the name of the student
     * @param name
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * Returns the name of the student
     * @return String: name
     */
    public String getName(){
        return this.name;
    }

    /**
     * Sets the ID of the Student
     * @param ID
     */
    public void setID(String ID){
        this.ID = ID;
    }

    /**
     * Returns the ID of the student
     * @return
     */
    public String getID(){
        return this.ID;
    }

    /**
     * Returns the status of the student
     * @return boolean: status
     */
    public boolean getStatus(){
        return this.status;
    }

    /**
     * Sets the status of the student
     * @param status
     */
    public void setStatus(boolean status){
        this.status = status;
    }


}
