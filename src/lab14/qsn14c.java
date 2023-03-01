package lab14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class qsn14c {
    static String Path="D:\\College\\JavaLabs\\Outputs\\qsn14c_1.jpg";
    static String Path2="D:\\College\\JavaLabs\\Outputs\\qsn14c_2.jpg";
    public static void Implementation() {
        FileInputStream fin;
        FileOutputStream fout;
        try{
            fin = new FileInputStream(Path);
            fout = new FileOutputStream(Path2);
            int databyte = 0;
            System.out.println("Start Copying File");
            while((databyte = fin.read())!=-1){
                fout.write(databyte);
            }
            System.out.println("Copied");
            fin.close();
            fout.close();
        }
        catch(FileNotFoundException ex){
            System.out.println("File Not found in the location: "+Path);
        }
        catch(IOException ex2){
            System.out.println("IO Exception has occurred");
        }
    }

}
