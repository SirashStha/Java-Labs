package lab9;

public class qsn9C {
    public void implementation() {
        class qsn9C_inner {
            public void inner_implementation() {
                System.out.println("I'm inside inner method of inner class");
            }
        }
        qsn9C_inner inner = new qsn9C_inner();
        inner.inner_implementation();
    }
}
