import java.util.*;

class PrimeNo
{
 public static void main(String args[])
 {
  Scanner sc = new Scanner(System.in);
  int n1 = sc.nextInt();
  int n2 = sc.nextInt();
  
  while(n1<n2)
  {
    boolean flag = false;
	
	 for(int i =2; i<=n1/2; i++)
	 {
	   // condition for non prime no.
	    
		 if(n1%i ==0)
		 {
		   flag = true;
		   break;
		 }
	 }
	 
	 if(!flag && n1!=0 && n1!=1)
	    System.out.print(n1+" ");
		
	n1++;
  }
 }
}