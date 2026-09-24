import java.util.*;
 
//Input 
//Output : 
class Pattern
{
    public void Display(int iNo)
    {
        int iCnt = 0;
        for(iCnt =-iNo; iCnt <=iNo; iCnt++)
        {
             System.out.print(iCnt+"\t");

            }
        
        System.out.println();
    }
}

class Program161
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
