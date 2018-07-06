import java.util.Scanner;
public class mbk {
    Scanner input=new Scanner(System.in);
    public void createbk(bk[] b, int n) {
        for (int i = 0; i < n; i++) {
            b[i].setbktitle();
            b[i].setbkprice();
        }
    }

    public void showbk(bk[] b, int n) {
        System.out.println("the books created are:");
        System.out.println("booktitle\tbookprice");
        for (int i = 0; i < n; i++) {
            //System.out.println("booktitle\tbookprice");
            System.out.println(b[i].getbktitle()+"\t\t\t"+b[i].getbkprice());
            //System.out.print("\t"+b[i].getbkprice());
        }
    }

    public static void main(String args[]) {
        mbk A = new mbk();
        System.out.println("enter the books to be added");
        int n = A.input.nextInt();
        bk[] b = new bk[n];
        for (int i = 0; i < n; i++){
            b[i]=new bk();
        }


        A.createbk(b, n);
        A.showbk(b, n);
    }

}




