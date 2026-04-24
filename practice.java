import java.util.Scanner;

class check
{
    public int demo(int ino)
    {
        if((ino % 2) == 0)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
}

class practice
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        
        int iret = 0;
        int ivalue = 0;
        System.out.println("enter the number");
        ivalue = sobj.nextInt();

        check cobj = new check();

        iret = cobj.demo(ivalue);


        if(iret == 1)
        {
        System.out.println(iret);
        }
        else{
                    System.out.println(iret);
   
        }

    } 
}