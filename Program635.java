//4th bit off
//  1111    1111    1111    1111    1111    1111    1111    0111
//  f       f       f       f       f       f       f       7
//0xfffffff7

import java.util.Scanner;

class Program635
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0 , iMask = 0;

        System.out.println("Enter the Number :");
        iNo = sobj.nextInt();

        iMask = 0xfffffff7;

        iNo = iNo & iMask;

        System.out.println("Updated number :"+iNo); 
    }
}

