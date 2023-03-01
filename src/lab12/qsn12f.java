package lab12;

public class qsn12f extends Exception{
    public qsn12f(String s){
        super(s);
    }
    public static void val(int n) throws qsn12f{
        if(n<0){
            throw new qsn12f("Value less than 0");
        }
        else{
            System.out.println("Number valid");
        }
    }

}
