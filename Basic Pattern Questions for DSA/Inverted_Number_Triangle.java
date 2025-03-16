public class Inverted_Number_Triangle {
    public static void main(String[] args) {
        int range = 5;
        System.out.println("Inverted Number Triangle");
        inverted_num_ptn(range);
    }
    public static void inverted_num_ptn(int range){
        if(range == 0) System.out.println("Please Enter Correct Range to Print Pattern...");

        for(int i = range; i >= 1; i--){
            for(int j=i; j >= 1; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    } 
}
