package lab12;

import java.util.Scanner;

public class qsn12c {
    public void NestedTry(){
        Scanner sc1=new Scanner(System.in);
        int[] array=new int[5];
        try{
            try{
                System.out.println("Enter contents: ");
                for(int i=0;i<10;i++){
                    array[i]=sc1.nextInt();
                }
            }
            catch(ArrayIndexOutOfBoundsException ex){
                System.out.println("Don't use more space than allocated");
            }
            System.out.println(1/0);
        }
        catch(ArithmeticException ex){
            System.out.println("Don't divide by 0");
        }
    }

}
