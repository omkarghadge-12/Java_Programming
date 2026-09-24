import java.util.*;
 
//Input : 5
//Output : -5 -4 -3 -2 -1 0 1 2 3 4 5
class Pattern
{
    public void Display(int iNo)
    {
        int iCnt = 0;
        for(iCnt =-iNo; iCnt <=0; iCnt++)
        {
             System.out.print(iCnt+"\t");

         }
         for(iCnt = 1; iCnt <= iNo; iCnt++)
         {
                         System.out.print(iCnt+"\t");
  
         }
        
        System.out.println();
    }
}

class Program160
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
