import java.util.Scanner;

class Program624
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int ino = 0;
        System.out.println("Enter the number :");
        ino = sobj.nextInt(); 

        int iMask = 4;
        int iResult = 0;

        iResult = ino & iMask;

        if(iResult == iMask)
        {
            System.out.println("3rd bit is ON");
        }
        else
        {
            System.out.println("3rd bit is off");
        }
        
    }
}

