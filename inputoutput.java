import java.util.Scanner; 


class Inputoutput
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);  

        int no1=0 , no2=0;
        int ans=0;

        System.out.println("enter first no.:");
        no1=sobj.nextInt();

        System.out.println("enter second no.:");
        no2=sobj.nextInt();

        ans=no1+no2;

        System.out.println("addition is :"+ans);
    }
}