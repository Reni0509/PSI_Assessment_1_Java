import java.util.Scanner;
public class Equal
{
  public static void main(String[] args)
  {
  int n1,n2,n3,n4;
  Scanner sc=new Scanner(System.in); //creating object to get input from user
  System.out.println("Input first number");
  n1=sc.nextInt();
  System.out.println("Input second number");//Getting input from user
  n2=sc.nextInt();
  System.out.println("Input third number");
  n3=sc.nextInt();
  System.out.println("Input fourth number");
  n4=sc.nextInt();
  if(n1==n2 && n2==n3 && n3==n4)//comparing the numbers
  {System.out.println("Equal");}
  else
  {System.out.println("Not Equal");}//displaying the results.
  }
}

