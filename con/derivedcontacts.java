package con;
import java.util.Scanner;
public class derivedcontacts extends basecontacts
{
    public void search(String searchstr)
    {
        for(int x=0;x<count;x++)
        {
            System.out.println("contact is");
            String[] a=list[x].split("");
            if(a[0].equals(searchstr))
            {
                System.out.println("name found");
                System.out.println("name is"+emp_name+"number is"+emp_number);
            }
        }
        System.out.println("contact not found");

    }
}


