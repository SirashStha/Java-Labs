package lab13;

public class qsn13a implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i<30; i++) {
            System.out.print(i+ " ");
            if(i%30 == 0) {
                System.out.println();
            }
        }
    }
}
