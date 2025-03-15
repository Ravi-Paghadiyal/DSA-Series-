public class Reverse_num {
    public static void main(String[] args) {
        int num = 123;
        System.out.println("Reverse Number is : "+reverse_num(num));
    }

    public static int reverse_num(int num){
        if(num == 0)return num;

        int reverse = 0;
        while (num > 0) {
            int rem = num % 10;
            reverse = (reverse * 10) + rem;
            num /=10;
        }

        return reverse;
    }
}
