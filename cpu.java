import java.util.Scanner;

class cpu
{
	Scanner sc=new Scanner(System.in);
	int price;

	void getcpu()
	{
		System.out.println("\nEnter the price of cpu:");
		price=sc.nextInt();
	} 

	class processor 
	{
		int ncore;
		String manf;

		void getprocessor()
		{
			System.out.println("Enter the no of cores of processor:");
			ncore=sc.nextInt();
			System.out.println("Enter the manufacturer of processor");
			manf=sc.next();
		}

		void putprocessor()
		{
			System.out.println("\n...Details of the processor...");
			System.out.println("No of cores of processor:"+ncore);
			System.out.println("Manufacturer of processor"+manf);
		}

	}	

	static class ram
	{
		int memory;
		String manf;
		Scanner sc=new Scanner(System.in);
		
		void getram()
		{
			System.out.println("Enter the memory size(GB) of ram:");
			memory=sc.nextInt();
			System.out.println("Enter the manufacturer of ram");
			manf=sc.next();
		}
		
		void putram()
		{
			System.out.println("\n...Details of the memory...");
			System.out.println("Memory size of ram:"+memory+"GB");
			System.out.println("Manufacturer of ram:"+manf);
		}

	}

}


public class computer {
public static void main(String args[]){
	cpu c=new cpu();
	cpu.processor p=c.new processor();
	cpu.ram r=new cpu.ram();

	c.getcpu();
	p.getprocessor();
	r.getram();

	
	p.putprocessor();
	r.putram();
	}
}