import java.util.*;
 
/*
    1 2 3 4
    1 2 3 4
    1 2 3 4
    1 2 3 4
*/
class Pattern
{
    public void Display(int iRow,int iCol)
    {
        int i = 0, j = 0;

        for(i = 1; i <= iRow; i++)
        {
            for(j = 1; j<= iCol; j++)
            {
                System.out.print(j+"\t");
            }
            System.out.println();
        }
    }
}

class Program166
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
