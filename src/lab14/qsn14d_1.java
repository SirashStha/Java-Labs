package lab14;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class qsn14d_1 {
    public static void Implementation() throws IOException {
        InputStream input = new FileInputStream("D:\\College\\JavaLabs\\Outputs\\qsn14d_1.txt");
        DataInputStream DI = new DataInputStream(input);
        int n = input.available();
        byte[] byt = new byte[n];
        DI.read(byt);
        for(byte bt : byt) {
            System.out.print((char)bt);
        }
    }

}
