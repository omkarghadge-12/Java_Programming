interface Demo
{
    int no=11;
    void display();
}
class hello implements Demo
{
    public void display()
    {
        System.out.println("inside display");
    }
}

class InterfaceDemo3
{
    public static void main(String A[])
    {
        System.out.println(Demo.no);    //no is public and static
       // Demo.no=12;  //no is final
        hello hobj =new hello();
        hobj.display();    
    }
}
