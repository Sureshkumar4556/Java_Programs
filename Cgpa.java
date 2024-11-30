import java.util.*;
import java.lang.*;
import java.text.DecimalFormat;
class Cgpa
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		//Get marks from user
		System.out.print("Java: ");
        	float m1 = sc.nextFloat();
		System.out.print("OS: ");
		float m2 = sc.nextFloat();
		System.out.print("Account: ");
		float m3 = sc.nextFloat();
		float total = m1+m2+m3;
       		float per = (total/300)*100;
		DecimalFormat df = new DecimalFormat("#.00");
		System.out.println("Result: "+df.format(per)+"%");
		double cg = per/9.5f;	
		DecimalFormat dd = new DecimalFormat("#.0");	
		System.out.println("CGPA: "+dd.format(cg));
	}
}