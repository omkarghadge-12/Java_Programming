import java.util.*;
 
//Input : 6
//Output : -6 -5 -4 -3 -2 -1 0
class Pattern
{
    public void Display(int iNo)
    {
        int iCnt = 0;
        for(iCnt = -iNo; iCnt <=0; iCnt++)
        {
             System.out.print(iCnt+"\t");

            }
        
        System.out.println();
    }
}

class Program158
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
