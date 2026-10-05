class Demo
{
    public void Dispaly(int no)
    {
        if(no == 0)
        {
            return;
        }

        System.out.println(no);
        Dispaly(no-1);
        System.out.println(no);
    }
}

class Program1000
{
    public static void main(String A[])
    {
        Demo dobj = new Demo();

        dobj.Dispaly(5);

    }
}