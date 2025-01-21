import java.util.Scanner;

class Arrays_2D{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr1 = new int[3][3];
        int[][] arr2 = new int[3][3];
        int[][] sum = new int[3][3];
       
        // my first arrays
        System.out.println("Enter Elements in first arrays : ");
       for(int i=0; i<arr1.length; i++){
        for(int j=0; j<3; j++){
            arr1[i][j] = sc.nextInt();
        }
            System.out.println();
       }

       
       // my second arrays 
       System.out.println("Enter Elements in second arrays : ");
       for(int i=0; i<arr2.length; i++){
        for(int j=0; j<3; j++){
            arr2[i][j] = sc.nextInt();
        }
            System.out.println();
       }



       for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                sum[i][j] = arr1[i][j] + arr2[i][j];
            }
            System.out.println();
       }

       // print arrays elements 
       for(int i=0; i<3; i++){
        for(int j=0; j<3; j++){
            System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}