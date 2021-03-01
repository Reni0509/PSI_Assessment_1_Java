import java.util.*;
import java.lang.*;
public class largest
{
 public static void main(String[] args)
  {
    int arr[]={1,4,17,7,25,3,100};//initialze the array
    int k=3;
    Arrays.sort(arr);//sort the array
    int val=arr.length-k;
    System.out.println("3 largest elements of the said array are");
    for(int i=arr.length-1;i>=val;i--)
    {System.out.print(arr[i]+" ");}//display the 3 largest elements.   
  }
}