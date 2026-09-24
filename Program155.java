import java.util.*;
 
//Input : 6
//Output : # * # * # *
//         1 2 3 4 5 6
class Pattern
{
    public void Display(int iNo)
    {
        int iCnt = 0;
        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            if(iCnt % 2 ==0)
            {
                System.out.print("*\t");

            }
            else
            {
                System.out.print("#\t");

            }
        }
        System.out.println();
    }
}

class Program155
{
    public static void main(String A[])
    {
        int iValue = 0;
        Scanner sobj = new Scanner(System.in);
        Pattern pobj = new Pattern();
        
        System.out.println("enter the frequency");
        iValue = sobj.nextInt();
        pobj.Display(iValue);
    }
}