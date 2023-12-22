//Encapsulation Practice
public class Employee {
    private int employee_ID;
    private String employee_name;
    private double employee_salary;

    public void setID(int ID){
        this.employee_ID = ID;
    }

    public void setName(String name){
        this.employee_name = name;
    }

    public void setSalary(double salary){
        this.employee_salary = salary;
    }

    public int getID(){
        return employee_ID;
    }

    public String getName(){ return employee_name; }

    public void getSalary(){
        System.out.println("Salary: " + employee_salary);
    }
}

