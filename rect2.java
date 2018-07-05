public class rect2{
    double length,breadth;
    rect2()
    {
        length=0;
        breadth=0;
    }
    void setData(double a,double b)
    {
        length=a;
        breadth=b;
    }
    void getData()
    {
        System.out.println("length of rectangle is"+length);
        System.out.println("breadth of rectangle is"+breadth);
    }
    double area()
    {
        double rarea=length*breadth;
        return rarea;
    }
    void display(){
        System.out.println("length of rectangle is="+length+"breadth of rectangle is="+breadth);

    }

}

