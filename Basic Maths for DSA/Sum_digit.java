public class Sum_digit {
    public static void main(String[] args) {
        int num = 12345;
        System.out.println("Sum of digit is : "+sum_of_digit(num));
    }    

    public static int sum_of_digit(int num){
        if(num == 0)return num;

        int sum = 0;
        while (num > 0) {
            int rem = num % 10;
            sum = sum + rem;
            num /=10;
        }

        return sum;
    }
}
