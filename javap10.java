import java.lang.*;
import java.util.*;
import java.io.*;

class javap10
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
                BufferedReader reader=new BufferedReader(new FileReader(fobj));
                //BufferedReader bobj = new BufferedReader(new FileReader(fobj));
                String str;

                while((str = reader.readLine())!= null )
                {
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