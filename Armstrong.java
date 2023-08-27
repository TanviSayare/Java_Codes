import java.lang.Math;

class Armstrong
{
 public static void main(String args[])
 {
 int number = 371 ,result = 0, originalNo , rem ;
 originalNo = number;
 while(originalno!=0)
 {
  rem = originalno % 10;
  result + = Math.pow(rem,3);
  originalno = originalno / 10;
 }
 if(number == result)
 {
  System.out.println("Number is Armstrong");
 }
 else
 {
  System.out.println("Number is Not Armstrong");
 }
 }
}