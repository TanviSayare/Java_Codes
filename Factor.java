public class Factor
{
 public static void main(String args[])
 {
  int number = 8;
  
  for(int i = 1; i<=number ; i++)
  {
   if(number%i==0)
   {
    System.out.println(i + " ");
   }
  }
 }
}