/**
 * @author - Kwaku Ofosu-Agyeman
 * @version - 1.0.1
 */
import java.util.LinkedList;

public class ChiefNursingOfficer {
    /**
     * Instance Variables
     */
    private String name;
    private int age;
    private String ID;
    private LinkedList<Student> list = new LinkedList<Student>();

    /**
     * Default constructor
     */
    ChiefNursingOfficer(){}

    /**
     * Second constructor(Overloaded)
     * @param name
     * @param age
     * @param ID
     */
    ChiefNursingOfficer(String name, int age, String ID){
        this.name = name;
        this.age = age;
        this.ID = ID;
    }

    /**
     * Sets the age of the chief nursing officer
     * @param age
     */
    public void setAge(int age){
        this.age = age;
    }

    /**
     * Returns the age of the chief nursing officer
     * @return int: age
     */
    public int getAge(){
        return this.age;
    }

    /**
     * Sets the name of the chief nursing officer
     * @param name
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * Returns the name of the chief nursing officer
     * @return String: name
     */
    public String getName(){
        return this.name;
    }

    /**
     * Sets the ID of the chief Nursing Officer
     * @param ID
     */
    public void setID(String ID){
        this.ID = ID;
    }

    /**
     * Returns the ID of the chief Nursing Officer
     * @return String:ID
     */
    public String getID(){
        return this.ID;
    }

    /**
     * Adds students to the linked list
     * @param newStudent
     */
    public void addStudents(Student newStudent){
        list.add(newStudent);
    }

    /**
     *Prints the names of the student
     */
    public void printStudents(){
        for (int i = 0; i < list.size();i++){
            System.out.print(list.get(i).getName() + " ");
        }
        System.out.println();

    }

    /**
     * Returns the linked list
     * @return LinkedList: list
     */
    public LinkedList<Student> getList() {
        return list;
    }

    /**
     * main method
     * @param args
     */
    public static void main(String [] args){
        ChiefNursingOfficer chiefNursingOfficer = new ChiefNursingOfficer("Adei",55,"3902");

        GhanaianStudent Kwaku = new GhanaianStudent();
        Kwaku.setName("Kwaku");
        NonGhanaianStudent Wangari = new NonGhanaianStudent();
        Wangari.setName("Wangari");

        chiefNursingOfficer.addStudents(Kwaku);
        chiefNursingOfficer.addStudents(Wangari);

        chiefNursingOfficer.printStudents();



    }

}
