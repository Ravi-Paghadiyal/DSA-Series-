public class Number_Triangle_Pattern {
    public static void main(String[] args) {
        int range = 7;

        System.out.println("Number Triangle Pattern");
        num_ptn(range);
    }

    public static void num_ptn(int range){
        if(range == 0) System.out.println("Please Enter Correct Range to Print Pattern...");

        for(int i=1; i<=range; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
