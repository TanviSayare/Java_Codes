class Pallendrome
{
 public static void main(String args[])
 {
  int num = 121;
  int reverse=0;
  int rem, temp;
  temp = num;
  while(temp!=0)
  {
   rem = temp%10;
   reverse = reverse * 10 + rem;
   temp = temp/10;
  }
  if(reverse == num)
  {
   System.out.println("The number is pallendrome");
  }
  else
  {
   System.out.println("The number is not pallendrome");
  }
 }
}