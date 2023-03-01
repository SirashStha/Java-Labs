package lab10.package1;

import java.util.Scanner;

public class Class1 {
    public long sec;
    public int hrs;
    public void implementation() {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Inside Class1 of Package1");
        System.out.println("Enter hours: ");
        hrs = sc1.nextInt();
        sec = hrs * 60 * 60;
        System.out.println(hrs+" hours = "+sec+" seconds");
    }
}
