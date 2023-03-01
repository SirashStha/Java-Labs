package lab13;

import static java.lang.Thread.sleep;

public class qsn13h implements Runnable{
    @Override
    public void run() {
        for(int i=1;i<=10;i++){
            System.out.print(i+" ");
            try{
                sleep(2000);
            }catch(Exception ex){
                System.out.println("Errors");
            }
        }

    }
}
