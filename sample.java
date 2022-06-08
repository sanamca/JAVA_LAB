import java.util.*;
public class sample
{
public static void main(String args[])
{
int limit,n,i,item,flag=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter the numbers to display");
limit=sc.nextInt();
int a[]=new int[limit];
System.out.println("enter the elemets");
for(i=0;i<limit;i++)
a[i]=sc.nextInt();
System.out.println("enter element to search");
item=sc.nextInt();
for(i=0;i<limit;i++)
{
if(item==a[i])
flag=1;
}
if(flag==1)
System.out.print("elemet"+item+"is found");
else
System.out.print("elemet"+item+"is not found");
}
}

	