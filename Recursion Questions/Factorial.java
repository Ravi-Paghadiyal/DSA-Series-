public class Factorial {
    public static void main(String[] args) {
     int n = 5; 
     System.out.println("Factorial : "+find_fact(n));
    }

    public static int find_fact(int n){
        if ((n == 0) || (n == 1)) {
            return n; 
        }
        
        return n * find_fact(n - 1);
    }
}
