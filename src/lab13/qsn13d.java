package lab13;

public class qsn13d extends Thread{
    public qsn13d(String n) {
        super(n);
    }
    public void run(){
        System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getPriority());
    }
}
