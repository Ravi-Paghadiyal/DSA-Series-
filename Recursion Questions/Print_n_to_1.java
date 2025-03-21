public class Print_n_to_1{
    public static void main(String[] args){
        int n = 10;
        print_n(n);
    }
    public static void print_n(int n){
        if (n == 0) {
            return;
        }

        System.out.print(n + " ");
        print_n(n-1);
    }
}