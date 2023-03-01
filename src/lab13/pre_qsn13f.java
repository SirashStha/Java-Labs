package lab13;

public class pre_qsn13f {
    public void print(){
        synchronized (this) {
            for (int i = 100; i >= 70; --i) {
                System.out.print(i + " ");
                if (i % 20 == 0) {
                    System.out.println();
                }
            }
        }
    }

}
