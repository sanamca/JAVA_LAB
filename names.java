import java.util.Scanner;
class names
{
String[] names=new String[10];
Scanner sc=new Scanner(System.in);
void read(int n)
{
int i;
System.out.println("ebnter the names:");
for(i=0;i<n;i++)
names[i]=sc.nextline();
}
void sort(int n)
{
int i,j;
String temp;
for(i=0;i<n;i++)
for(i=0;j<n;j++)
{
if((names[i].compareTo(names[j]))>0)
{
temp=names[i];
names[i]=names[j];
names[j]=temp;
}
}
}
void display(int n)
{
int i;
for(i=0;i<n;i++)
System.out.println(names[i]);
}
}
public class sort
{
public static void main(String args[])
{
int n;
Scanner sc=new Scanner(System.in);
System.out.println(""\n no of str");
n=sc.nextInt();
names s=new names();
s.read();
s.read(n);
System.out.println(" bef sorting");
s.display(n);
s.sort(n);
System.out.println(" af sorting");
s.display(n);
s.display(n);
}
}