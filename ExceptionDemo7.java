import java.util.*;
class ExceptionDemo7
{
    public static void main(String A[])
    {
        Scanner sobj= new Scanner(System.in);
        int ino1=0,ino2=0,ians=0;

        System.out.println("enter first number");
        ino1 = sobj.nextInt();

        System.out.println("enter second number");
        ino2 = sobj.nextInt();

        try
        {
            System.out.println("inside try block");
             ians = ino1/ino2;
        }
            
            System.out.println("hello");        //error

        catch(ArithmeticException aobj)     //specific catch
        {
            System.out.println("inside catch block");
            System.out.println(aobj);
        }
        catch(Exception eobj)               //generic catchs
        {
            System.out.println("inside generic catch block");

        }
        finally
        {
            System.out.println("inside finally block");

        }
        
        System.out.println("dividion is :"+ians);

    }
}