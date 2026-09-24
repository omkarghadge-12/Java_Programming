 /*
  input : 5
  output :a  b   c  d  e
  index : 1  2   3  4  5
  ASCII:  97 98 99 100 101

*/
import java.util.*;

class Pattern
{
    public void Display(int iNo)
    {
        int iCnt = 0;
        int i = 97;


        for(iCnt = 0; iCnt <= iNo; iCnt++,i++)
        {
            System.out.printf("%C\t",i);
        }
        System.out.println();
    }
}

class Program174
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
