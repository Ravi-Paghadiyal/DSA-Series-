public class Sum_digit{
    public static void main(String[] args){
        int n = 5;
        System.out.println("This is My Answer "+count_sum(n));
    }

    public static int count_sum(int n){
        if(n == 0){
            return -1;
        }

        if (n == 1) {
            return 1;
        }
         
        return n + count_sum(n-1);
    }
}