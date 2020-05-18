/**
 * @author - Kwaku Ofosu-Agyeman
 * @version - 1.0.1
 */

import java.util.Random;

public class TestingAuthority {
    private String name;

    /**
     * Sets the name
     * @param name
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * Returns the name of the testing Authority
     * @return String: name
     */
    public String getName(){
        return this.name;
    }

    /**
     * Constructor for The class
     * @param name
     */
    TestingAuthority(String name){
        this.name = name;
    }

    /**
     * Returns a randomly generated boolean
     * @return boolean: rand1
     */
    public boolean statusGen(){
        Random rand = new Random();
        boolean rand1 = rand.nextBoolean();
        return  rand1;
    }

    /**
     * Uses a thread that randomly prints the status of 5 students in Ghana
     */
    static class TestingInsideGhana implements Runnable{
        /**
         * Runnable run method that manipulates and prints the status of 5 students in Ghana
         */
        @Override
        public void run() {
            //Adds 5 students to the linked lists of students
            ChiefNursingOfficer chiefNursingOfficer = new ChiefNursingOfficer();//Creates a new chief nursing officer
            for (int i = 0; i < 5; i++) {
                GhanaianStudent student = new GhanaianStudent();
                chiefNursingOfficer.addStudents(student);//Adds students in Ghana to the linked list in the chief nursing officer class
            }
            //Randomly sets the status of students int the linked list
            for(int i = 0; i < chiefNursingOfficer.getList().size(); i++){
                TestingAuthority testingAuthority = new TestingAuthority("Tests");
                chiefNursingOfficer.getList().get(i).setStatus(testingAuthority.statusGen());//Random assignment of status
            }
            //Printing the status
            for(int i = 0; i < chiefNursingOfficer.getList().size(); i++){
                boolean stat = chiefNursingOfficer.getList().get(i).getStatus();
                if(stat){
                    System.out.println("Testing Student Outside Ghana " + (i+1) + ": " + "POSITIVE");
                }
                else{
                    System.out.println("Testing Student Outside Ghana " + (i+1) + ": " + "NEGATIVE");
                }
            }
        }
    }

    /**
     * Uses a thread that randomly prints the status of 5 students outside Ghana
     */
    static class TestingOutsideGhana implements Runnable{
        /**
         * Runnable run method that manipulates and prints the status of 5 students outside Ghana
         */
        @Override
        public void run() {
            //Adds 5 students to the linked lists of students
            ChiefNursingOfficer chiefNursingOfficer = new ChiefNursingOfficer();//Creates a new chief nursing officer
            for (int i = 0; i < 5; i++) {
                NonGhanaianStudent student = new NonGhanaianStudent();
                chiefNursingOfficer.addStudents(student);//Adds students outside Ghana to the linked list in the chief nursing officer class
            }
            //Randomly sets the status of students int the linked list
            for(int i = 0; i < chiefNursingOfficer.getList().size();i++){
                TestingAuthority testingAuthority = new TestingAuthority("Tests");
                chiefNursingOfficer.getList().get(i).setStatus(testingAuthority.statusGen());//Random assignment of status
            }
            //Printing the status
            for(int i = 0; i < chiefNursingOfficer.getList().size(); i++){
                boolean stat = chiefNursingOfficer.getList().get(i).getStatus();
                if(stat){
                    System.out.println("Testing Student Outside Ghana " + (i+1) + ": " + "POSITIVE");
                }
                else{
                    System.out.println("Testing Student Outside Ghana " + (i+1) + ": " + "NEGATIVE");
                }

            }

        }
    }
    //Concurrent Programming

    /**
     * main method
     * @param args
     */
    public static void main(String [] args){
        Thread tGH = new Thread(new TestingInsideGhana());
        Thread tNGh = new Thread(new TestingOutsideGhana());
        tGH.start();
        tNGh.start();
    }


}
