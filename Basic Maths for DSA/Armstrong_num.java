// what is a Armstrong Number ?
// Armstrong number is a number where the sum of its digits, each raised to the power of the total number of digits, is equal to the number itself.
// Ex : 153 -> (1)3 + (5)3 + (3)3 = 153
// Ex : 9474 -> (9)4 + (4)4 + (7)4 + (4)4 = 9474

public class Armstrong_num {
    public static void main(String[] args) {
     int num = 153;   
     System.out.println("Number is Armstong Number : "+check_arm_num(num));

    }

    // Count The total number of digits
    public static int count_digit(int num){
        if (num == 0)return num;

        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }

    // check the number is armstong number or not 
    public static boolean check_arm_num(int num){
        
        int original_num = num;
        int total_digit = count_digit(original_num);
        int sum = 0;

        while (num > 0) {
            int rem = num % 10;
            sum = sum + (int)Math.pow(rem,total_digit);
            num /=10;
        }

        return sum == original_num; 
    }
}
