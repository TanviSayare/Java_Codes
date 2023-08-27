class Reverse
{
 public static void main(String args[])
 {
  int num = 1234 , reverse = 0;
  System.out.println("Original Number : " +num);
  while(num != 0)
  {
   int rem = num%10;
   reverse = reverse * 10 + rem;
   num = num / 10;
  }
  System.out.println("Reverse Number : " +reverse);
 }
}