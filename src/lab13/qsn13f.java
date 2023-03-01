package lab13;

public class qsn13f extends Thread{
    pre_qsn13f pre = new pre_qsn13f();
    public qsn13f(pre_qsn13f pre) {
        this.pre = pre;
    }
    public void run(){
        pre.print();
    }
}
