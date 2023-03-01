package lab13;

public class qsn13g extends Thread{
    public void run(){
        for(int i=100;i>=0;--i){
            System.out.print(i+" ");
            if(i%30==0){
                System.out.println();
            }
            try{
                sleep(3000);
            }catch(Exception ex){
                System.out.println("Errors");
            }
        }
    }

}
