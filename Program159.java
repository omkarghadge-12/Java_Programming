import java.util.*;
 
//Input : 6
//Output : 0 1 2 3  4 5 6
class Pattern
{
    public void Display(int iNo)
    {
        int iCnt = 0;
        for(iCnt =0; iCnt <=iNo; iCnt++)
        {
             System.out.print(iCnt+"\t");

            }
        
        System.out.println();
    }
}

class Program159
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
