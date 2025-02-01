public class Even_and_odd {
    public static void main(String[] args) {
        int n = 50;

        if (isOdd(n)) {
            System.out.println("This is Odd Number");
        }else{
            System.out.println("This is Even Number");
        }
    }

    public static boolean isOdd(int n){
        return (n & 1) == 1;
    }
}
