import java.util.Scanner;

class Program623
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int no = 0;
        System.out.println("Enter the number :");
        no = sobj.nextInt();

        int ans = 0;
        int count1 = 0;
        int count2 = 0;

        while(no != 0)
        {
            ans = no % 2 ;
            System.out.print(ans);
            
            //count = count + ans;
            if(ans == 1)
            {
                count1++;
            }
            if(ans == 0)
            {
                count2++;
            }
            no = no / 2;
        }

        System.out.println("\ncount of 1 is :"+count1);
        System.out.println("count of 0 is :"+count2);

        
    }
}

/*
    Decimal         Hexadecimal         Binary
        0               0               0000
        1               1               0001
        2               2               0010
        3               3               0011
        4               4               0100
        5               5               0101
        6               6               0110
        7               7               0111
        8               8               1000
        9               9               1001
        10              a               1010
        11              b               1011
        12              c               1100
        13              d               1101
        14              e               1110
        15              f               1111


    hexadecimal number formation

    1011    1111    1000    0101    0011    1011    1110    0001
    b       f      8       5       3       b       e       1

    no = 0xbf853be1
*/ 