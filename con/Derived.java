package con;
import java.util.Scanner;
public class Derived extends basecontacts {
    Derived(int n) {
        super(n);
    }

    public void search(String searchstr) {

        for (int x = 0; x < count; x++) {
            String[] a = list[x].split("");
            if (a[0].equals(searchstr)) {
                System.out.println("name found");
                System.out.println("contact is");
                System.out.println("name is" + a[0] + "number is" + a[1]);
                return;
            }
        }
        System.out.println("contact not found");
    }
}



