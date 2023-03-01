package lab14;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class qsn14i {
    String s="Test Serializable and Deserializable";
    public static void Implementation() throws Exception{
        qsn14i obj=new qsn14i();
        FileOutputStream fos = new FileOutputStream("D:\\College\\JavaLabs\\Outputs\\qsn14i.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(obj);
        System.out.println("Serializaion Completed");
        FileInputStream fis = new FileInputStream("D:\\College\\JavaLabs\\Outputs\\qsn14a.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        qsn14i obj2= (qsn14i) ois.readObject();
        System.out.println("Deserialization completed ");
        System.out.println(obj2.s);
    }
}
