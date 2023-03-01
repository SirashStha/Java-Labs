package lab10.package1;

import java.util.Scanner;

public class Class2 {
        public String str;
        public void implementation() {
                Scanner sc1 = new Scanner(System.in);
                System.out.println("Inside Class2 of Package1");
                System.out.println("Enter a string: ");
                str = sc1.next();
                System.out.println("Entered String: "+str.toUpperCase());
        }
}
