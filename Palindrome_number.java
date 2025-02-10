public class Palindrome_number {
    public static void main(String[] args){
        int n = 121;
        // System.out.println(revers(n));
        System.out.println(chech_palin(n)+" This is Palindrome Number");
    }

    static int revers_number = 0;
    public static int revers(int n){
        if(n != 0){
            int remainder = n%10;
            revers_number = remainder + (revers_number * 10);
            revers(n/10);
        }

        return revers_number;
    }

    public static boolean chech_palin(int n){
        return n == revers(n);
    }
}