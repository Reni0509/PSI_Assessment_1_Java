public class boolArray
{
  public static void main(String[] args)
  {
    boolean array[][]={{true,false,true},{false,true,false}};
    for(int i=0;i<2;i++)
    {
      for(int j=0;j<3;j++)
      {
       if(array[i][j]==true)        //checking the values of the array
       {System.out.print('t'+" ");}
       else
       {System.out.print('f'+" ");}//print the results accordingly.
      }
       System.out.println(" ");
    }
  }
}