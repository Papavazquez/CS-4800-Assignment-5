package prime;

import java.util.Scanner;

public class Prime {
	
	
	public static void isPrime () {
		int i;
		int m=0;
		int flag=0;      
		int n = PrimeTest.number;
		  m=n/2;      
		  if(n==0||n==1){  
		   System.out.println(n+" is not prime number");      
		  }else{  
		   for(i=2;i<=m;i++){      
		    if(n%i==0){      
		     System.out.println(n+" is not prime number");      
		     flag=1;      
		     break;      
		    }      
		   }      
		   if(flag==0)  { System.out.println(n+" is prime number"); }  
		  }//end of else  
		
	}
	
	
	
	
	

}
