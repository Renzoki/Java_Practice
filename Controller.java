import java.util.Scanner;

/*
Controller class for the following classes:
- BankAccount, Circle, Employee, Person, Rectangle, Student
 */

public class Controller {
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);
        byte choice;

        System.out.println("Choose File to Run:\n 1 - Person\n 2 - BankAccount\n 3 - Rectangle\n 4 - Employee\n 5 - Circle\n 6 - Student\n");
        System.out.print("Your choice: ");
        choice = sc.nextByte();

        if(choice == 1){ //Person
            Person person = new Person();

            sc.nextLine(); //consumes leftover newline character
            System.out.print("Input person's name: ");
            person.setName(sc.nextLine());
            System.out.print("Input person's age: ");
            person.setAge(sc.nextInt());
            sc.nextLine(); //consumes leftover newline character
            System.out.print("Input person's country of origin: ");
            person.setCountry(sc.nextLine());

            System.out.println("\nName: " + person.getName());
            System.out.println("Age: " + person.getAge());
            System.out.println("Country: " + person.getCountry());

        } else if (choice == 2) { //BankAccount
            BankAccount BankAcc = new BankAccount();

            System.out.print("Input Account Number: ");
            BankAcc.setAccNum(sc.nextInt());
            System.out.print("Input Account Balance: ");
            BankAcc.setBal(sc.nextDouble());

            System.out.println("\nAccount Number: " + BankAcc.getAccNum());
            System.out.println("Account Balance: " + BankAcc.getBal());

        } else if (choice == 3) { //Rectangle
            Rectangle rectangle = new Rectangle();

            System.out.print("Input width: ");
            rectangle.setWidth(sc.nextInt());
            System.out.print("Input length: ");
            rectangle.setLength(sc.nextInt());

            int area = rectangle.getLength() * rectangle.getWidth();
            System.out.println("\nThe area of the rectangle is " + area);
            System.out.println("The perimeter of the rectangle is " + (2 * area));

        } else if (choice == 4) { //Employee
            Employee employee =  new Employee();

            System.out.print("Input employee ID: ");
            employee.setID(sc.nextInt());
            sc.nextLine();
            System.out.print("Input employee name: ");
            employee.setName(sc.nextLine());
            System.out.print("Input employee salary: ");
            employee.setSalary(sc.nextDouble());

            System.out.println("\nEmployee ID: " + employee.getID());
            System.out.println("Employee Name: " + employee.getName());
            employee.getSalary();

        } else if (choice == 5) { //Circle
            Circle circle = new Circle();

            System.out.print("Input circle radius: ");
            circle.setRadius(sc.nextDouble());

            System.out.println("\nRadius: " + circle.getRadius());
            System.out.println("Area: " + circle.getArea());
            System.out.println("Perimeter: " + circle.getPerimeter());

        } else if (choice == 6) { //Student
            Student student = new Student();

            sc.nextLine();
            System.out.print("Input student name: ");
            student.setName(sc.nextLine());
            System.out.print("Input student ID: ");
            student.setID(sc.nextInt());

            System.out.println("\nName: " + student.getName());
            System.out.println("ID: " + student.getID());

            System.out.print("\nInput student grade: ");
            student.addGrade(sc.nextDouble());

        } else {
            main(Args); //call itself in case user is a dumdum
        }
    }
}
