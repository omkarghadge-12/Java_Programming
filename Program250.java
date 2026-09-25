import java.util.*;

class StringX
{
    public int CountSmall(String str)
    {
        int iCnt =0;
        int iCount = 0;
        char Arr[] = str.toCharArray();

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if((Arr[iCnt] >= 'a') && (Arr[iCnt] <= 'z'))
            {
                iCount++;
            }
        }
        return iCount;
    }
}
class Program250
{
    public static void main(String A[])
    {
        int iRet = 0;
        Scanner scanobj = new Scanner(System.in);

        System.out .println("enter string :");
        String sobj = scanobj.nextLine();
        
        StringX strobj = new StringX();

        iRet = strobj.CountSmall(sobj);
        System.out.println("Occurence of Small character is :"+iRet);
    }
}