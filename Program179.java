import java.util.*;
 
/*
  iRow:4
  iCol:4

  a b c d
  a b c d
  a b c d
  a b c d


*/
class Pattern
{
    public void Display(int iRow,int iCol)
    {
        int i = 0, j = 0;
        char ch = 'a';

        for(i = 1; i <= iRow; i++)
        {
            for(j = 1,ch = 'a'; j<= iCol; j++,ch++)
            {
                System.out.printf("%c\t",ch);           //Important (to reset)
                
            }
            System.out.println();
        }
    }
}

class Program179
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
