package lab3;

public class qsnD {
    public void implementation(){
        int[] arr=new int[15];
        for(int i=0;i<15;i++) {
            arr[i]=i+1;
        }

        System.out.println("\n\nNumber D");
        System.out.print("Elements in Sample Array: ");
        for(int items: arr) {
            System.out.print(items+" ");
        }
        System.out.println();
    }

}
