public class Diamond_Half_Pyramid {
    public static void main(String[] args) {
        int range = 6;
        System.out.println("Diamond Pattern");
        half_dai_ptn(range);
    }

    public static void half_dai_ptn(int range){
        if(range == 0) System.out.println("Please Enter Correct Range to Print Pattern...");

        for(int i=1; i<=range; i++){
            for(int j=1; j<=i; j++){
                System.out.printf("*");
            }
            System.out.println();
        }

        for(int k=range-1; k>=1; k--){
            for(int m=k; m>=1; m--){
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
