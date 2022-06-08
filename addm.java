import java.util.Scanner;
public class addm
{
public static void main(String args[])
{
int r,c,i,j;
Scanner in=new Scanner(System.in);
System.out.println("enter the number of rows");
r=in.nextInt();
System.out.println("enter the number of coloumns");
c=in.nextInt();
int m1[][]=new int[r][c];
int m2[][]=new int[r][c];
int m3[][]=new int[r][c];
System.out.println("enter the elemets m1");
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
m1[i][j]=in.nextInt();
System.out.println();
}
System.out.println("enter the elemets m2");
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
m2[i][j]=in.nextInt();
System.out.println();
}
for(i=0;i<r;i++)
for(j=0;j<c;j++)
m3[i][j]=m1[i][j]+m2[i][j];
System.out.println("sum matricse");
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
System.out.print(m3[i][j]+"\t");
System.out.println();
}
}
}
