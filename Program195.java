import java.util.*;
 
/*
  iRow:4
  iCol:4

  * 
  * * 
  * * * 
  * * * *

*/
class Pattern
{
    //filter for square matrix
    public void Display(int iRow,int iCol)
    {
        int i = 0, j = 0;
       
        if(iRow != iCol)
        {
            System.out.println("invalid input");
            System.out.println("Row no. and cloumn no. should be same");
            return;

        }
        for(i = 1; i <= iRow; i++)
        {
            for(j = 1; i >= j; j++)
            {
                       System.out.print("*\t");

            }
                
        }
            System.out.println();
    }
}


class Program195
{
    public static void main(String A[])
    {
        int iValue1 = 0, iValue2 = 0;

        Scanner sobj = new Scanner(System.in);
        
        System.out.println("enter the no. of rows ");
        iValue1 = sobj.nextInt();
        System.out.println("enter the no. of columns ");
        iValue2 = sobj.nextInt();

        Pattern pobj = new Pattern();
        pobj.Display(iValue1,iValue2);
    }
}
