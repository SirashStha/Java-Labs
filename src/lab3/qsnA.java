package lab3;

public class qsnA {
    int arr[] = new int[15];
    int i = 0;
    public void implementation() {
        for(i = 0; i < 15; i++) {
            arr[i] = i + 1;
        }
        System.out.println("\nNumber A");
        System.out.println("Sum of 3rd and last element: "+(arr[2]+arr[arr.length-1]));
    }
}
