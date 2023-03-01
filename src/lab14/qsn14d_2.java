package lab14;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class qsn14d_2 {
    public static void Implementation() throws IOException {
        FileOutputStream file = new FileOutputStream("D:\\College\\JavaLabs\\Outputs\\qsn14d_2.txt");
        DataOutputStream data = new DataOutputStream(file);
        String s="Sirash";
        byte byt[]=s.getBytes();
        data.write(byt);
        data.flush();
        data.close();
        System.out.println("Written in file");
    }

}
