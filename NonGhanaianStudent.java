/**
 * @author - Kwaku Ofosu-Agyeman
 * @version - 1.0.1
 */

public class NonGhanaianStudent extends Student {
    /**
     * Instance variable
     */
    private String nationality;

    /**
     * Default Constructor
     */
    public NonGhanaianStudent(){}

    /**
     * sets the nationality of the student
     * @param nationality
     */
    public void setNationality(String nationality){
        Student.isGhanaian=false;
        this.nationality = nationality;
     }
}
