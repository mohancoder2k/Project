package Project;
import java.util.*;

public class Switch_test {

	public static void main(String[] args)
	{
	 int option;
	 int i,j,k,r,n;
	 System.out.println("Enter Your Option:\n");
	 System.out.println("1) Factorial\n");
	 System.out.println("2) Floyd triangle\n");
	 System.out.println("3) Multi table\n");
	 System.out.println("4) Number table\n");
	 System.out.println("5) Reverse Number\n");
	 System.out.println("6) Sum odd even\n");
	 Scanner s = new Scanner(System.in);
	 option = s.nextInt();
	 switch(option)
	 {
	 case 1:
		 	int fact=1;
		 	System.out.println("Enter range:\n");
		 	n=s.nextInt();
		 	for(i=1;i<=n;i++)
		 	{
		 		fact=fact*i;
		 		System.out.println(i+ "factorial is " +fact);
		 	}
		 	break;
		 	
		 	
	 case 2:
		 
		 	System.out.println("Enter range:\n");
		 	n=s.nextInt();
		 	for(i=0;i<=n;i++)
		 	{
		 		r=i%2;
		 		for(j=0;j<=i;j++)
		 		{
		 			r=(r==0)?1:0;
		 			System.out.println(r+"\t");
		 		
		 		}
		 		System.out.println("\n");
		 	}
		 	break;
		 	
	 case 3:
		 	System.out.println("Enter Range:\n");
		 	n=s.nextInt();
		 	for(i=1;i<=n;i++)
		 	{
		 		for(j=1;j<=i;j++)
		 		{
		 			System.out.println(i*j+"\t");
		 			System.out.println("\n");
		 		}
		 	}
		 	break;
		 	
	 case 4:
		 	System.out.println("Enter Range:\n");
		 	n=s.nextInt();
		 	for(i=1,k=1;k<=n;k++)
		 	{
		 		for(j=1;j<=k;i++,j++)
		 		{
		 			System.out.println(i+"\t");
		 			System.out.println("\n");
		 		}
		 	}
		 	break;
		 	
	 case 5:
		 	//n= number//
		    int rev=0;
		    int rem;
		     System.out.println("Enter Number:\n");
		 	 n=s.nextInt();
		 	 System.out.println("Number :"+n);
		 	 while(n>0)
		 	 {
		 		 rem=n%10;
		 		 rev = rev*10+ rem;
		 		 n=n/10;
		 	 }
		 	 System.out.println("Reversed Number is : "+rev);
		 	 break;
		 	 
	 case 6:
		 	int Oddsum=0,Evensum=0;
		 	for(i=1;i<=100;i++)
		 	{
		 		if(i%2==0)
		 		{
		 			Evensum = Evensum + i;
		 		}
		 		else
		 		{
		 			Oddsum = Oddsum+i;
		 	
		 		}
		 	}
		 	System.out.println("Sum of Odd Numbers :"+Oddsum);
		 	System.out.println("\n Sum of Even Numbers :"+Evensum);
		 	break;
		 	
	 }

	}

}
