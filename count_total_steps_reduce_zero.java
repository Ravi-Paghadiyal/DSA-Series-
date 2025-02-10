public class count_total_steps_reduce_zero {
    public static void main(String[] args){
        int n = 12;

        System.out.println("Total Steps to reduced Zero : "+count_total_steps(n));
    }


    static int count = 0;
    static int num_hold = 0;

    public static int count_total_steps(int n){
        if (n == 0) {
            return 0;
        }

     
       if (n >= 1) {
             if (n % 2 == 0) {
            num_hold = n / 2;
            count++;
            count_total_steps(num_hold);
            }else{
            num_hold = num_hold - 1;
            count++;
            count_total_steps(num_hold);
            }
       }

        return count;
    }
}
