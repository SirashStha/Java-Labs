package lab1;

public class Box {
//    private double length;
//    private double breadth;
//    private double height;
    private double length, breadth, height;

    private double volume;

    public Box(double length, double breadth, double height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    public void printAll() {
        System.out.println("Length: "+length);
        System.out.println("Breadth: "+breadth);
        System.out.println("Height: "+height);
    }

    public void calcVolume() {
        volume = length * breadth * height;
        System.out.printf("Volume: "+volume);
    }
}
