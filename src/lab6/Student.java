package lab6;

public class Student {
    public int roll;

    public void read(int roll) {
        this.roll = roll;
    }

    public void display() {
        System.out.println("\nName: Student Name");
        System.out.println("Roll No. "+roll);
    }

}
