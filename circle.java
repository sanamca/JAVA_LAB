import java.util.*;
class circle_demo
{
	double ar,per,r;
	double pi=3.14;
	void area()
	{
	ar=pi*r*r;
	}
	void perimeter()
	{
	per=2*pi*r;
	}
	void display()
	{
	System.out.print("Area="+ar);
	System.out.println();
	System.out.print("Perimeter="+per);
	}

}

public class circle
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	circle_demo c=new circle_demo();
	System.out.println("Enter radius");
	c.r=sc.nextDouble();
	c.area();
	c.perimeter();
	c.display();
	}

}