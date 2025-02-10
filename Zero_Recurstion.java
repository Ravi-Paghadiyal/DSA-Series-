public class Zero_Recurstion {
    public static void main(String[] args){
        int n = 100000002;
        System.out.println("Total Zero : "+count_zeros(n));

    }

    static int count = 0;
    public static int count_zeros(int n){
        if (n == 0) {
            return 0;
        }

        if (n >= 1) {
            int remainder = 0;
            remainder = n%10;

            if (remainder == 0) {
                count++;
            }

            count_zeros(n/10); /*This is decresh the number size one by one */
        }

        return count;
    }
}
