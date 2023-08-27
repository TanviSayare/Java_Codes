class Quadratic
{
 public static void main(String args[])
 {
  double a = 2.3 , b = 4, c = 5.6;
  double root1,root2;
  
  double determinant = b*b-4*a*c;
  if(determinant > 0){
  root1=(-b+Math.sqrt(determinant))/(2*a);
  root2=(-b-Math.sqrt(determinant))/(2*a);
  
  System.out.format(" Root1 : " +root1);
  System.out.format(" Root1 : " +root1);
  }
  else if (determinant==0)
  {
	root1=root2=-b/(2*a);
	System.out.format("root : " +root1);
  }
  else{
	double real = -b/(2*a);
	double imag = Math.sqrt(-determinant)/(2*a);
	System.out.format("root1 : " +real,imag);
    System.out.format("root2 : " +real,imag);
  }
 }
}