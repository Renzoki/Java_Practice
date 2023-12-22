//Encapsulation Practice
public class Student {
    private int student_ID;
    private String student_name;
    private double student_Grades;

    public void setID(int ID){
        this.student_ID = ID;
    }

    public void setName(String name){
        this.student_name = name;
    }

    public int getID(){
        return student_ID;
    }

    public String getName(){
        return student_name;
    }

    public void addGrade(double grade){
        if(grade >= 0 && grade <= 100){
            System.out.println("\nGrade: " + grade);
        }
        else{
            System.out.println("\nInvalid grade!");
        }
    }
}
