import java.util.*;
class pdt
{
	int pcode,price;
	String pname;
	
}

class product
{
	public static void main(String srgs[])
	{
	Scanner sc=new Scanner(System.in);
	pdt p=new pdt();
	pdt q=new pdt();
 	pdt r=new pdt();

	System.out.print("enter pcode pname price:");
	p.pcode=sc.nextInt();
	p.pname=sc.next();
	p.price=sc.nextInt();

	System.out.print("enter pcode pname price2:");
	q.pcode=sc.nextInt();
	q.pname=sc.next();
	q.price=sc.nextInt();

	System.out.print("enter pcode pname price3:");
	r.pcode=sc.nextInt();
	r.pname=sc.next();
	r.price=sc.nextInt();

	if(p.price<q.price && p.price<r.price)
		System.out.print(p.pname+" has lowest price");
	else if(q.price<r.price)
		System.out.print(q.pname+" has lowest price");
	else
		System.out.print(r.pname+" has lowest price");
	}

}