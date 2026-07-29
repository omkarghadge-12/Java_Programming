class base
{
    public int i,j;
    public void fun()
    {
        System.out.println("inside base fun");
    }
    public void gun()
    {
        System.out.println("inside base gun");
    }
    public void sun()
    {
        System.out.println("inside base sun");
    }
    public void bun()
    {
        System.out.println("inside base bun");
    }
}
class Derived extends base
{
    public int x;
    public void gun()
    {
        System.out.println("inside derived gun");
    }

    public void sun()
    {
        System.out.println("inside derived sun");
    }
    public void run()
    {
        System.out.println("inside derived run");
    }
    public void mun()
    {
        System.out.println("inside derived mun");
    }
}

class RMDdemo2
{
    public static void main(String A[])
    {
        base bp= new Derived();        //upcasting

        bp. fun();      //base fun
        bp. gun();      //derived gun
        bp. sun();      //derived sun
       // bp. run();      //error
       // bp. mun();      //error
        bp. bun();      //base bun

    }
}