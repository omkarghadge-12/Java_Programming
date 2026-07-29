import java.util.Scanner;

class SwitchDemo
{
    public static void main(String A[])
    {
       Scanner sobj=new Scanner(System.in);
        int istd = 0;

        System.out.println("enter your std:");
        istd=sobj.nextInt();

        switch(istd)
        {
            case 1:
                System.out.println("exam at 9");
                break;

            case 2:
                System.out.println("exam at 10");
                break;

            case 3:
                 System.out.println("exam at 11");
                break;
            case 4:
                System.out.println("exam at 12");
                break;

            default:
                System.out.println("invalid std");

        }


    }
}    