import java.util.*;

class Program293
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int Arr[] = {45,21,90,54,78};
        //This is for each loop
        for(int no : Arr)
        {
            System.out.println(no);
        }
        
        Arrays.sort(Arr);
        System.out.println("Array after sorting :");
        for(int no : Arr)
        {
            System.out.println(no);
        }

    }
}