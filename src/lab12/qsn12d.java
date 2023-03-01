package lab12;

public class qsn12d {
    public void ThrowTry(){
        try{
            throw new ArithmeticException("qsn");
        }
        catch(ArithmeticException ex){
            System.out.println("Exception caught inside ThrowTry");
        }
    }
}
