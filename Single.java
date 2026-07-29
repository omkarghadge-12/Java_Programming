class base      //8
{
    public int i , j;

    public void fun()
    {
        System.out.println("inside base fun");
    }
}

class Derived extends base      //12
{
    public int x;

    public void gun()
    {
          System.out.println("inside inside erived gun");

    }
}


class Single
{
    public static void main(String A[])
    {
        base bobj=new base();
        Derived dobj=new Derived();

        bobj.fun();

        dobj.fun();
        dobj.gun();
    }
}