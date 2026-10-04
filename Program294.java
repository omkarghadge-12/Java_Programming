import java.util.*;

class Program294
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
        
        int index = Arrays.binarySearch(Arr,90);
        System.out.println("element found at :"+index);

    }
}