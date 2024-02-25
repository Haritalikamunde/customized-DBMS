import java.lang.*;
import java.util.*;
import java.io.*;

class javap8
{
    public static void main(String arg[])
    {
        try   
        {
            Scanner sobj=new Scanner(System.in);
            
            System.out.println("Enter the file Name :");
            String fileName=sobj.nextLine();

            File fobj=new File(fileName);
            
            boolean bobj=fobj.createNewFile();

            if(bobj==true)
            {
                System.out.println("File created...");
            }
            else
            {
                System.out.println("File already exist.");
            }
        }

        catch(IOException obj)
        {
            System.out.println(obj);
        }
    }
}