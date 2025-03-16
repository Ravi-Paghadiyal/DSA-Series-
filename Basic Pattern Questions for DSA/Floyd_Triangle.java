public class Floyd_Triangle {
    public static void main(String[] args) {
        int range = 6;
        System.out.println("Floyd’s Triangle");
        floyd_num_ptn(range);
    }

    public static void floyd_num_ptn(int range){
        if(range == 0) System.out.println("Please Enter Correct Range to Print Pattern...");

        int n = 1;
        for(int i=1; i<=range; i++){
            for(int j=1; j<=i; j++){
                System.out.print(n++ + " ");
            }
            System.out.println();
        }
    }
}
