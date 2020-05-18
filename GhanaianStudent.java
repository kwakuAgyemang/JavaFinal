/**
 * @author - Kwaku Ofosu-Agyeman
 * @version - 1.0.1
 */

public class GhanaianStudent extends Student{
    /**
     * Instance variable
     */
    private String nationality;

    /**
     * Default Constructor
     */
    public GhanaianStudent(){}

    /**
     * Sets the nationality of the student
     */
    public void setNationality(){
        Student.isGhanaian = true;
        this.nationality = "Ghanaian";
    }
}
