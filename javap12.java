import java.lang.*;
import java.util.*;
import java.io.*;    
import java.nio.charset.StandardCharsets;


class javap12
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
                FileInputStream ifobj=new FileInputStream(fobj);
                //FileInputStream fiobj = new FileInputStream(fobj);
                byte buffer[]= new byte[100];
                int ret=0;
                int Sum=0;

                while((ret= ifobj.read(buffer))!= -1)
                {
                    Sum=Sum+ret;

                    String str=new String(buffer, StandardCharsets.UTF_8);
                    System.out.println(str);
                }

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