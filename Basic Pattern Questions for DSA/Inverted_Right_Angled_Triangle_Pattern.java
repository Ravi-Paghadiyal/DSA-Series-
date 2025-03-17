public class Inverted_Right_Angled_Triangle_Pattern {
    public static void main(String[] args) {
        int range = 4;

        System.out.println("Inverted Right-Angled Triangle Pattern");
        inverted_rigth_ptn(range);
    }
    public static void inverted_rigth_ptn(int range){
        if(range == 0) System.out.println("Please Enter Correct Range to Print Pattern...");

        for(int i = range; i >= 1; i--){
            for(int j=i; j >= 1; j--){
                System.out.printf("*");
            }
            System.out.println();
        }
    }   
}
