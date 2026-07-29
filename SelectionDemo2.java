import java.util.Scanner;

class SelectionDemo2
{
    public static void main(String A[])
    {
       Scanner sobj=new Scanner(System.in);
        int istd = 0;

       System.out.println("enter your std:");

       istd=sobj.nextInt();

       if(istd==1)
       {
             System.out.println("exam at 9:");

       }
       else if (istd==2)
       {
             System.out.println("exam at 10");

       }
        else if (istd==3)
       {
             System.out.println("exam at 11");

       }
          else if (istd==4)
       {
             System.out.println("exam at 12");

       }
       else
       {
              System.out.println("invalid std");

       }
       





    }
}