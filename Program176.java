 /*
  input : 5
  output :a  b   c  d  e
  index : 1  2   3  4  5
  ASCII:  65 66  67 68 69 

*/
import java.util.*;

class Pattern
{
    public void Display(int iNo)
    {
        int iCnt = 0;
       // int i = 97;
        char ch = 'A';

        for(iCnt = 1; iCnt <= iNo; iCnt++,ch++)
        {
            System.out.printf("%c\t",ch);
        }
        System.out.println();
    }
}

class Program176
{
    public static void main(String A[])
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);
        
        System.out.println("enter the frequency ");
        iValue = sobj.nextInt();
       

        Pattern pobj = new Pattern();
        pobj.Display(iValue);
    }
}
