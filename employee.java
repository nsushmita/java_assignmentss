import java.util.Scanner;
public class employee
{
    int emp_number;
    String emp_name;
    String joining_date;

    public employee()
    {
        this.emp_number = emp_number;
        this.emp_name = emp_name;
        this.joining_date = joining_date;
    }

    public void getemp()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the employee number :: ");
        emp_number = in.nextInt();
        System.out.println("Enter the employee name :: ");
        emp_name = in.next();
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the joining date :: ");
        joining_date = input.nextLine();
    }

    public void display()
    {
        System.out.println("Employee number = " + emp_number);
        System.out.println("Employee name = " + emp_name);
        System.out.println("Employee joining date = " + joining_date);
    }

    public static void main(String args[])
    {
        employee e[] = new employee[5];

        for (int i = 0; i < 5; i++) {
            e[i] = new employee();
            e[i].getemp();
        }

        System.out.println("the details are");

        for (int i = 0; i < 5; i++)
        {
            e[i].display();
        }
    }
}


