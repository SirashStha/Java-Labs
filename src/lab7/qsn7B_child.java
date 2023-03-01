package lab7;

public class qsn7B_child extends qsn7B {
    public int a = 30;
    public int b = 50;

    public void addDisplay() {
        System.out.println("Child Class");
        System.out.println("Value of a: "+a);
        System.out.println("Value of b: "+b);
        System.out.println("Addition: "+(a+b));
        System.out.println("Old value of a: "+super.a);
        System.out.println("Old value of b: "+super.b);
        super.addDisplay();
    }
}
