package lab13;

public class qsn13c extends qsn13b{
    public static class qsn13c_second extends Thread {
        public void run(){
            for(int i=100;i>=70;--i){
                System.out.print(i+" ");
                if(i%30==0){
                    System.out.println();
                }
            }
        }
    }
}
