import java.util.Scanner;

class Program620
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