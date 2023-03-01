package lab3;

import java.util.Scanner;

public class qsnB {
    int [][] arr = new int[3][3];
    Scanner sc1 = new Scanner(System.in);
    public void implementation() {
        System.out.println("\nNumber B");

        System.out.println("Enter elements of array:");
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print("Array["+(i+1)+"]["+(j+1)+"]: ");
                arr[i][j] = sc1.nextInt();
            }
        }

        System.out.println("Matrix:");
        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Diagonal Elements:");
        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++) {
                if(i==j) {
                    System.out.print(arr[i][j]+" ");
                }
            }
        }


    }
}
