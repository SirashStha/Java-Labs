package lab12;

public class qsn12a {
    public void Div(){
        try{
            System.out.println(1/0);
        }
        catch(Exception ex){
            System.out.println("Don't divide by 0");
        }
        finally{
            System.out.println("Implemented");
        }
    }

}
