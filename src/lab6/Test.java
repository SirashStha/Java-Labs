package lab6;

public class Test extends Student{
    public float sub1Marks, sub2Marks;

    public void readMarks(float sub1Marks, float sub2Marks) {
        this.sub1Marks = sub1Marks;
        this.sub2Marks = sub2Marks;
    }

    public void displayMarks() {
        System.out.println("Marks in Subject 1: "+sub1Marks);
        System.out.println("Marks in Subject 2: "+sub2Marks);
    }

}
