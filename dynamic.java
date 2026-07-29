import  java.util.Scanner;


class Dynamic
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int length = 0;
        int Arr[];
        System.out.println("enter the elements:");
        length =sobj.nextInt();

        Arr = new int[length];

        if(Arr == null)
        {
            System.out.println("unable to allocate");

        }
        else{
            System.out.println("memory gets allocated");

        }
        
        Arr=null;
        System.gc();
        

    }
}