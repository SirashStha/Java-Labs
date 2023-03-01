package lab14;

import java.io.FileWriter;
import java.util.Scanner;

public class qsn14h {
    public static void Implementation() throws Exception{
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter the text you want to enter in file: ");
        String s=sc1.nextLine();
        FileWriter fw=new FileWriter("D:\\College\\JavaLabs\\Outputs\\qsn14h.txt");
        fw.write(s);
        System.out.println("Written in File");
        fw.close();
    }

}
