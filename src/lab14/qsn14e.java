package lab14;

import java.io.IOException;
import java.io.RandomAccessFile;

public class qsn14e {
    static String Path ="D:\\College\\JavaLabs\\Outputs\\qsn14e.txt";
    public static void Implementation() throws IOException {
        RandomAccessFile file = new RandomAccessFile(Path, "r");
        file.seek(16);
        byte[] bytes = new byte[22];
        file.read(bytes);
        for(byte bt : bytes) {
            System.out.print((char)bt);
        }
        file.close();
    }

}
