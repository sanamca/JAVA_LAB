
import java.util.Scanner;
import graphics.inter;
import graphics.rectamgle;
import graphics.square;
import graphics.triangle;
import graphics.circle;


public class packages
{

public static void main(String args[])
{
int ch;
Scanner sc=new Scanner(System.in);
do
{

System.out.println("\noption: \n1.circle\n2.rectangle\n3.triangle\n4.square\n5.exit \nEnter your option:");
 ch=sc.nextInt();

if(ch==1)
{
circle c=new circle();
c.area();

}
if(ch==2)
{
rectamgle b=new rectamgle();
b.area();

}

if(ch==3)
{
triangle v=new triangle();
v.area();

}

if(ch==4)
{
square z=new square();
z.area();
}
if(ch==5)
{
break;
}

}while(ch>0 && ch<5);

}}