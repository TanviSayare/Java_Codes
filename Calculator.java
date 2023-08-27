import java.util.*;
public class Calculator
{
 public static void main(String args[])
 {
  char operator ;
  Double n1,n2,result;
  Scanner sc = new Scanner(System.in);
  
  System.out.println("choose an Operator +,-,*,/,% : ");
  operator = sc.next().charAt(0);

  System.out.println("Enter the First Number : ");
  n1 = sc.nextDouble();

  System.out.println("Enter the Second Number : ");
  n2 = sc.nextDouble();

  switch(operator)
  {
   case '+' :
    result = n1 + n2;
	System.out.println( n1 +"+"+ n2 +"="+ result);
	break;
	
	case '-' :
    result = n1 - n2;
	System.out.println( n1 +"-"+ n2 +"="+ result);
	break;
	
	case '*' :
    result = n1 * n2;
	System.out.println( n1 +"*"+ n2 +"="+ result);
	break;
	
	case '/' :
    result = n1 / n2;
	System.out.println( n1 +"/"+ n2 +"="+ result);
	break;
	
	case '%' :
    result = n1 % n2;
	System.out.println( n1 +"%"+ n2 +"="+ result);
	break;
	
	default :
	System.out.println("Invalid Operator");
	break;
  } 
    
 }
}