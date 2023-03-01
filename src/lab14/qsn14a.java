package lab14;

import java.io.FileInputStream;

public class qsn14a {
    public static void Implementation(){
        final String path="D:\\College\\JavaLabs\\Outputs\\qsn14a.txt";
        try{
            FileInputStream fin=new FileInputStream(path);
            int a=0;
            while((a=fin.read())!=-1){
                System.out.print((char)a);
            }
            System.out.println();
            fin.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

}
