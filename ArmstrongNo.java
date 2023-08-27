import java.util.*;
class ArmstrongNo
{
 public static void main(String args[])
 {
  Scanner sc = new Scanner(System.in);
  int n1 = sc.nextInt();
  int n2 = sc.nextInt();
  
  for(int num=n1+1; num<n2; num++)
  {
   int digit = 0;
   int result = 0;
   int origNo = num;
   
   // no of digit calculation
   while(origNo!=0)
   {
    origNo = origNo / 10;
	digit++;
   }
   origNo = num;
   
   //result contain nth power of its digit
   while(origNo!=0)
   {
    int rem = origNo%10;
	result  = result + Math.pow(rem,digit);
	origNo = origNo / 10;
   }
   
   if(result==num)
   {
    System.out.print(num +" ");
   }
  }
 }
}