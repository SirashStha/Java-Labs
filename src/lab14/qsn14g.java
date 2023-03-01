package lab14;

import java.io.FileWriter;

public class qsn14g {
    public static void Implementation() throws Exception{
        FileWriter fw=new FileWriter("D:\\College\\JavaLabs\\Outputs\\qsn14g.txt");
        fw.write("Test FileWriter Class");
        System.out.println("Written in File");
        fw.close();
    }

}
