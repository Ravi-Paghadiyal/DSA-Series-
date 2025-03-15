public class Min_digit {
    public static void main(String[] args){
        
        // find the Minimum Digit 
        int num = 987;

        int ans = find_mini(num);

    System.out.println("Minimum Digit is : "+ans);
    }
    // This is method to find the max Digit
    public static int find_mini(int num){
        int min = 9;
        while (num > 0) {
            int rem = num % 10;
            if (rem == 0) return rem;

            if (rem < min) {
                min = rem;
            }
            num /= 10;
        }
        return min;
    }
}
