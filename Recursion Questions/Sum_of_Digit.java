public class Sum_of_Digit {
    public static void main(String[] args){
        int n = 12345;
        System.out.println("Sum of Digit : "+sum_n(n));
    }

    public static int sum_n(int n){
        if (n == 0) {
            return 0;
        }
        
        int sum = n % 10;
        return sum + sum_n(n/10);
    }
}
