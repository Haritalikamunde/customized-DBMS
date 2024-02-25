import java.lang.*;
import java.util.*;
import java.io.*;

class javap9
{
    public static void main(String arg[])
    {
        try   
        {
            Scanner sobj=new Scanner(System.in);
            
            System.out.println("Enter the file Name :");
            String fileName=sobj.nextLine();

            File fobj=new File(fileName);

            if(fobj.exists())
            {
                long size=fobj.length();
                System.out.println("Size of the file is :" +size);
            }
            else
            {
                System.out.println("There is no such file.");
            }
        }

        catch(Exception obj)
        {
            System.out.println(obj);
        }
    }
}