import java.lang.*;
import java.util.*;

class ArrayX
{
    private int Arr[];

    public ArrayX(int iNo)
    {
        Arr=new int[iNo];
    }

    public void Accept()
    {
        int iCnt=0;
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter the values of array :");
        for(iCnt=0;iCnt<Arr.length; iCnt++)
        {
            Arr[iCnt]=sobj.nextInt();
        }
    }

    public void Display()
    {
        int iCnt=0;
        System.out.println("the values of array are :");
        for(iCnt=0;iCnt < Arr.length; iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }
    }

    public int Summation()
    {
        int iSum=0;

        for(int iCnt=0;iCnt<Arr.length; iCnt++)
        {
            iSum=iSum+Arr[iCnt];
        }
        return iSum;
    }
}

class javap6
{
    public static void main(String b[])
    {
        Scanner sobj=new Scanner(System.in);
        int iRet=0, iLength=0;

        System.out.println("Enter the lenght of array:");
        iLength=sobj.nextInt();

        ArrayX obj=new ArrayX(iLength);

        obj.Accept();
        obj.Display();

        iRet=obj.Summation();

        System.out.println("Summation of Array is:"+iRet);
        
    }
}