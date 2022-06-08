import java.util.Scanner;
class areafinder
{
	void areaof(double r)
	{
		System.out.println("\n Area of Circle "+3.14*r*r);
	}

	void areaof(int l,int b)
	{
		System.out.println("\n Area of Rectangle "+l*b);	
	}

	void areaof(int a)
	{
		System.out.println("\n Area of Square "+a*a);	
	}

	void areaof(double b,double h)
	{
		System.out.println("\n Area of Triangle "+0.5*b*h);
	}

}


class Area
{
	public static void main(String args[])
	{
		areafinder ar=new areafinder();
		ar.areaof(3.2);
		ar.areaof(8,6);
		ar.areaof(5);
		ar.areaof(6.0,8.0);
	}
}