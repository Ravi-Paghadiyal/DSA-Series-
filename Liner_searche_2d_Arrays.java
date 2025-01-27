import java.util.Scanner;

public class Liner_searche_2d_Arrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][] arr = new int[3][3];

        System.out.println("Enter Elemetns on 2D arrays : ");
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<3; j++){
                arr[i][j] = in.nextInt();
            }
            System.out.println();
        }

        System.out.println("Enter Searche Elements on 2D arrays : ");
        int se = in.nextInt();

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<3; j++){
                if (se == arr[i][j]) {
                    System.out.println("arr["+i+"]["+j+"] = " + arr[i][j] );
                    System.out.println("Searche Elments Founded "+arr[i][j]);
                }
            }
            System.out.println();
        }
        in.close();
    }
}
