package lab6;

public class Result extends Test{
    public float total;

    public void calculate() {
        total = sub1Marks + sub2Marks;
    }

    public void displayTotal() {
        System.out.println("Total Marks: "+total);
    }
}
