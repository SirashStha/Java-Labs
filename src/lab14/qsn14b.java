package lab14;

import java.io.FileOutputStream;

public class qsn14b {
    public static void Implementation(){
        final String path="D:\\College\\JavaLabs\\Outputs\\qsn14b.txt";
        try{
            FileOutputStream fout=new FileOutputStream(path);
            String s="Sirash";
            byte byt[]=s.getBytes();
            fout.write(byt);
            fout.close();
            System.out.println("Written in file");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

}
