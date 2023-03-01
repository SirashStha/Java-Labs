package lab3;

public class qsnC {
    public void implementation(){
        int arr[][] = new int[][] {
                new int[] {1,2,3},
                new int[] {4,5,6,7,8},
                new int[] {2,5}
        };
        System.out.println("\nNumber C");
        System.out.print("Elements in Array: ");
        for(int i=0;i<3;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
        }
    }
}
