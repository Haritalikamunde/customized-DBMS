import java.lang.*;

class base
{
    public int i;
    public int j;

    public base(int a, int b)
    {
        this.i=a;
        this.j=b;
    }

    public void fun()
    {
        System.out.println("Inside base fun");
    }
}

class Derived extends base
{
    public int x;
    public int y ;

    public Derived()
    {
        super(11,21);
        System.out.println("Inside Derived constructor");
        this.x=30;
        this.y=40;

    }

    public void sun()
    {
        System.out.println("Inside Derived sun");
        System.out.println(super.i);
        super.fun();
    }
}

class javap5

{
    
    public static void main(String arg[])
    {
        System.out.println("inside main");

        //base bobj=new base();
        Derived dobj=new Derived();
    
        dobj.sun();
    }
}