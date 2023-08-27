import java.util.*;
public class Pno
{
 public static void main(String args[])
 {
  int count=0;
  System.out.println("Enter the Number : ");
  Scanner sc = new Scanner(System.in);
  int number = sc.nextInt();
  for(int i=2;i<number;i++)
  {
   if(number%i==0)
   {
    count++;
   }
  }
  if(count==0)
  {
   System.out.println("Prime Number");
  }
  else
  {
   System.out.println("Not Prime Number");
  }
 }
}