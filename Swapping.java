class Swapping
{
 public static void main(String args[])
 {
  int first = 10;
  int second = 20;
  int temp;
  System.out.println("Before Swapping");
  System.out.println("First Number : " +first);
  System.out.println("Second Number : " +second);
  
  temp = first;
  first = second;
  second = temp ;
  
  System.out.println("After Swapping");
  System.out.println("First Number : " +first);
  System.out.println("Second Number : " +second);
  
 }
}