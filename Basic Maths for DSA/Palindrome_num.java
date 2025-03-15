// Palindrome number ?
//A palindrome number is a number that reads the same forward and backward.
// Ex : 121 = 121 (Revers)

public class Palindrome_num {
    public static void main(String[] args) {
        int num = 121;
        System.out.println("The number is Palindrome : "+check_pali(num));
    }

    public static boolean check_pali(int num){
        if(num == 0) return false;

        int original_num = num;
        int sum = 0;
        while (num > 0) {
            int rem = num % 10;
            sum = (sum * 10) + rem;
            num /=10; 
        }

        return sum == original_num;
    }
}
