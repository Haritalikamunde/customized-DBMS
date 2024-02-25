//to print all files of directory

import java.io.*;
import java.util.*;
import java.lang.*;

class javap14
{
    public static void main(String arg[])
    {
        try
        {

        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter the file name to create ");
        String folderName=sobj.nextLine();

        File fobj=new File(folderName);

        File allFiles[]=fobj.listFiles();

        for(int i=0; i<allFiles.length;i++)
        {
            System.out.println(allFiles[i].getName());
        }
        }
        catch(Exception obj)
        {

        }
    }
}