package lab13;

public class qsn13b extends Thread{
    public void run() {
        for (int i = 0; i<30; i++) {
            System.out.print(i+ " ");
            if(i%30 == 0) {
                System.out.println();
            }
        }
    }
}
