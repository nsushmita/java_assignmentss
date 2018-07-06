import java.util.Scanner;
public class testrect2 {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the length of rectangle:");
        rect2 A=new rect2();
        double l1=input.nextDouble();
        while(l1<=0||l1>20)
        {
            System.out.println("length cannot be negative or zero or greater than 20");
            l1=input.nextDouble();
        }
        System.out.println("enter the breadth of rectangle:");
        double b1=input.nextDouble();
        while(b1<=0||b1>20)
        {
            System.out.println("breadth cannot be negative or zero or greater than 20");
            b1=input.nextDouble();
        }
        A.setData(l1,b1);
        A.getData();
        System.out.println("the area of rectangle1 is"+A.area());
        System.out.println("the perimeter of rectangle1 is"+A.perimeter());
        System.out.println("enter the length of the sec rectangle");
        rect2 B=new rect2();
        double l2=input.nextDouble();
        while(l2<=0||l2>20)
        {
            System.out.println("length cannot be negative or zero or greater than 20");
            l2=input.nextDouble();
        }
        System.out.println("enter the breadth of the sec rectangle");
        double b2=input.nextDouble();
        while(b2<=0||b2>20)
        {
            System.out.println("breadth cannot be negative or zero or greater than 20");
            b2=input.nextDouble();
        }
        B.setData(l2,b2);
        B.getData();
        System.out.println("the area of rectangle2 is"+B.area());
        System.out.println("the perimeter of rectangle2 is"+B.perimeter());
        System.out.println("enter the length of the third rectangle");
        rect2 C=new rect2();
        double l3=input.nextDouble();
        while(l3<=0||l3>20)
        {
            System.out.println("length cannot be negative or zero or greater than 20");
            l3=input.nextDouble();
        }
        System.out.println("enter the breadth of the third rectangle");
        double b3=input.nextDouble();
        while(b3<=0||b3>20)
        {
            System.out.println("breadth cannot be negative or zero or greater than 20");
            b3=input.nextDouble();
        }
        C.setData(l3,b3);
        C.getData();
        System.out.println("the area of rectangle3 is"+C.area());
        System.out.println("the perimeter of rectangle3 is"+C.perimeter());
        System.out.println("enter the length of the fourth rectangle");
        rect2 D=new rect2();
        double l4=input.nextDouble();
        while(l4<=0||l4>20)
        {
            System.out.println("length cannot be negative or zero or greater than 20");
            l4=input.nextDouble();
        }
        System.out.println("enter the breadth of the fourth rectangle");
        double b4=input.nextDouble();
        while(b4<=0||b4>20)
        {
            System.out.println("breadth cannot be negative or zero or greater than 20");
            b4=input.nextDouble();
        }
        D.setData(l4,b4);
        D.getData();
        System.out.println("the area of rectangle4 is"+D.area());
        System.out.println("the perimeter of rectangle4 is"+D.perimeter());
        System.out.println("enter the length of the fifth rectangle");
        rect2 E=new rect2();
        double l5=input.nextDouble();
        while(l5<=0||l5>20)
        {
            System.out.println("length cannot be negative or zero or greater than 20");
            l5=input.nextInt();
        }
        System.out.println("enter the breath of the fifth rectangle");
        double b5=input.nextDouble();
        while(b5<=0||b5>20)
        {
            System.out.println("breadth cannot be negative or zero or greater than 20");
            b5=input.nextDouble();
        }
        E.setData(l5,b5);
        E.getData();
        System.out.println("the area of rectangle5 is"+E.area());
        System.out.println("the perimeter of rectangle5 is"+E.perimeter());
    }
}




