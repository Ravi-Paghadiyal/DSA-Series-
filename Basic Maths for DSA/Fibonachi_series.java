public class Fibonachi_series {
    public static void main(String[] args) {
        fibo(6);
    }
    public static void fibo(int size){
        int a = 0,b = 1,c;

        while (size > 0) {
            System.out.print(a);
           c = a + b;
           a = b;
           b = c;

            size--;
        }
        
    }
}
