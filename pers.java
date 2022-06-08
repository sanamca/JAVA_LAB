import java.util.Scanner;
class person
{
                 
	int age;
	String name,address,gender;
	person()
	{
     Scanner sc=new Scanner(System.in);
      System.out.println("\nEnter the name of person:");
      name=sc.next();
       System.out.println("\nEnter the address:");
      address=sc.next();
       System.out.println("\nEnter the gender:");
      gender=sc.next();
       System.out.println("\nEnter the age:");
      age=sc.nextInt();
	}
}
class employee extends person
{
 int salary;
 String id,cname,qu;
 employee()
 {
 	 Scanner sc=new Scanner(System.in);
 	 System.out.println("\nEnter the company name:");
      cname=sc.next();
      System.out.println("\nEnter the employee id:");
      id=sc.next();
      
      System.out.println("\nEnter the qualification:");
      qu=sc.next();
      
      System.out.println("\nEnter the salary:");
      salary=sc.nextInt();
      

 }
}
class teacher extends employee
{
	String sub,dept,tid;
	teacher()
	{
		Scanner sc=new Scanner(System.in);
		 System.out.println("\nEnter the subject name:");
         sub=sc.next();
         System.out.println("\nEnter the department name:");
         dept=sc.next();
         System.out.println("\nEnter the teacher id:");
         tid=sc.next();
	}
 void disp()
 {
 	 System.out.println("\n  name:"+name);
       System.out.println("\n address:"+address);
       System.out.println("\n  gender:"+gender);
       System.out.println("\n  age:"+age);
       System.out.println("\n  company name:"+cname);
      System.out.println("\n  employee id:"+id);
      System.out.println("\n  qualification:"+qu);
      System.out.println("\n  salary:"+salary);
       System.out.println("\n  name of subject:"+sub);
        System.out.println("\n  name of department:"+dept);
         System.out.println("\n  id of teacher:"+tid);
      
 }
}

class pers
{
  public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int n;
	 System.out.println("\nEnter the no.of teacher:");
	 n=sc.nextInt();
	 teacher t[]=new teacher[n];
	 for(int i=0;i<n;i++)
	 {
       t[i]=new teacher();
     }
      System.out.println("\ndetails of teacher");
      for(int i=0;i<n;i++)
      {
      	t[i].disp();
      }
  }
}
