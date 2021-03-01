import java.util.Scanner;
public class ZeroToOne
{
 public static void main(String[] args)
 {
   double n1,n2;
   Scanner sc=new Scanner(System.in);//creating object for scanner class to get input
   System.out.println("Input first number");
   n1=sc.nextDouble();
   System.out.println("Input second number");//Get input from user
   n2=sc.nextDouble();
   System.out.println(n1>=0 && n1<=1 && n2>=0 && n2<=1);//check the range of the numbers and print the result.
   }
 }