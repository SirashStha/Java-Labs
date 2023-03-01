package lab13;

public class qsn13e extends Thread{
    synchronized public static void print(){
        for(int i=100;i>=70;--i){
            System.out.print(i+" ");
            if(i%30==0){
                System.out.println();
            }
        }
    }
    public void run(){
        print();
    }

}
