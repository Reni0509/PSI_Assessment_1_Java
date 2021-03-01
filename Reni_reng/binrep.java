import java.util.Scanner;
import java.lang.*;
public class binrep
{
 public static void main(String[] args)
  {
    int count=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Input first number");//get the number from user
    int n1=sc.nextInt();   
    String binnum=Integer.toBinaryString(n1);//convert to binary form
    System.out.println("Binary representation of"+n1+"is "+binnum);
    for(char a:binnum.toCharArray()){
    if(a=='0'){count++;}}//counting number of zeroes
    System.out.println("Number of zer bits is "+count);//print the result.
  }
 
}