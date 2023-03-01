package lab14;

import java.io.FileReader;

public class qsn14f {
    public static void Implementation() throws Exception{
        FileReader fr=new FileReader("D:\\College\\JavaLabs\\Outputs\\qsn14f.txt");
        int i=0;
        while((i=fr.read())!=-1)
            System.out.print((char)i);
        fr.close();
    }

}
