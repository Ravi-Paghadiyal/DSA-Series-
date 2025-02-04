public class Recurtion_factorial {
    public static void main(String[] args){
        int n = 5;
        System.out.println("This is Your Factorial "+find_fact(n));
    }

    public static int find_fact(int n){
        if(n == 0){
            return -1;
        }

        if (n == 1) {
            return 1;
        }

        return n * find_fact(n-1);
    }
}
