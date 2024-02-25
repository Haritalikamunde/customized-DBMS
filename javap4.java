import java.lang.*;

class base
{
    public int i;
    public int j;

    public base()
    {
        this.i=27;
        this.j=0;
    }

    public void fun()
    {
        System.out.println("Inside base fun");
    }

    public void fun(int X)
    {
        System.out.println("Inside base fun with integer argument ");
    }

    public void gun()
    {
        System.out.println("Inside base gun");
    }

   
}

class Derived extends base
{
    public int x;
    public int y ;

    public Derived()
    {
        System.out.println("Inside Derived constructor");
        this.x=30;
        this.y=0;

    }

    public void sun()
    {
        System.out.println("Inside Derived sun");
    }
}

class javap4
{
    static
    {
        System.out.println("inside static block");
    }
    public static void main(String arg[])
    {
        base bobj=new base();
        Derived dobj=new Derived();
        dobj.fun();
        dobj.fun(45);
        dobj.gun();
        dobj.sun();

        System.out.println(dobj.i);
        System.out.println(dobj.x);
    }
}