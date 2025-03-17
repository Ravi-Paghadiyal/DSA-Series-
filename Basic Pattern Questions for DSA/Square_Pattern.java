public class Square_Pattern {
    public static void main(String[] args){
        int range = 5;
        System.out.println("Square Pattern");
        square_ptn(range);
    }

    public static void square_ptn(int range){
        if(range == 0) System.out.println("Please Enter Correct Range to Print Pattern...");

        for(int i=1; i<=range; i++){
            for(int j=1; j<=range; j++){
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}