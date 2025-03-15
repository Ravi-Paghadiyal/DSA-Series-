class Max_digit{
    public static void main(String[] args){
        
        // find the maximum Digit
        int num = 43210;

        int ans = find_max(num);

    System.out.println("Maximum Digit is : "+ans);
    }
    // This is method to find the max Digit 
    public static int find_max(int num){
        int max = 0;

        if (max == 0 && max == num) {
            return -1;
        }

        while (max < num) {
            int rem = num % 10;
            if (max < rem) {
                max = rem;
            }
            num = num / 10;
        }
        return max;
    }
} 