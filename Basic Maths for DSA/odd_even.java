public class odd_even {
    public static void main(String[] args) {
        // Question is to check the number is odd or even 
        int n = 12;

        if (check_odd_even(n)) {
            System.out.println("This Number is Odd. ");
        }else{
            System.out.println("This Number is Even. ");
        }
    }

    public static boolean check_odd_even(int n){
        if(n == 0) return false;
         
        boolean ans = false;
        if (n % 2 == 0) {
            ans = false;
        }else{
            ans = true;
        }

        return ans;
    }
}
