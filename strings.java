import java.util.Scanner;
public class strings
{
	public static void main(String args[]){
	String s1,s2;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter string1 : ");
	s1=sc.next();
	System.out.println("Enter string2 : ");
	s2=sc.next();
	System.out.println("1.Uppercase of string1 : "+s1.toUpperCase());
	System.out.println("2.Lowercase of string1 : "+s1.toLowerCase());
	System.out.println("5.Index of 'h' in string1 : "+s1.indexOf('h'));
	System.out.println("3.Substring of string1 from index 2 to 4 : "+s1.substring(2,4));
	System.out.println("4.Length of string1 : "+s1.length());	
}
}