import java.io.*;

public class File_Write 
{
    public static void main(String[] args) throws IOException
    {
       
        File dir=new File("PW");

        File file=new File(dir, "pw.txt");
       // file.createNewFile();

       FileWriter fw=new FileWriter(file, true);

       fw.write("java");
       fw.write("\n");    // it is an escape sequence for next line
       fw.write(65);   // it will store the ASCII value of 65 in file
       fw.write("\n");
       fw.write(97);
       fw.write("\n");
       char ch[]={'j', 'a', 'v', 'a'};
       fw.write(ch);   // arrays can also be inserted
       fw.write("\n");

       //fw.close();
       fw.flush();

       System.out.println("open pw.txt to see result");
 
    }
    
}