public class RowToCol
{
  public static void main(String[] args)
  {
    int arr[][]={{10,20,30},{40,50,60}};//initializing the arrays
    System.out.println("Original Array");
    for(int i=0;i<=1;i++)
    {
     for(int j=0;j<=2;j++)
     {
      System.out.print(arr[i][j]+" ");//printing the original array
     }
     System.out.println();
    }
     System.out.println("After changing the rows and columns of the said array");
 
    for(int i=0;i<=2;i++)
    {
     for(int j=0;j<=1;j++)
     {
      System.out.print(arr[j][i]+" ");//interchanging the rows and columns and printing the array
     }
     System.out.println();
    }
  }
}