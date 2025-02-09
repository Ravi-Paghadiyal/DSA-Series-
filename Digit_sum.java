public class Digit_sum {
    public static void main(String[] args){
        int n = 12345;
        System.out.println("This is Total Number of sum : "+digit_count(n));
        System.out.println("This is final product : "+product(n));

    }

    public static int digit_count(int n){

        if (n == 0) {
            return 0;
        }

        return (n%10) + digit_count(n/10);
    }

    public static int product(int n){

        if (n == 0) {
            return 1;
        }

        return (n%10) * product(n/10);
    }
}
