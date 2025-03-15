// prime number ? -> Number divisible by it self and 1 like 7
// i am create one program to check the number is prime or not 
public class Prime_num {
    public static void main(String[] args) {
        // int num = 7;
        int num = 4;

        if (check_prime(num)) {
            System.out.println("This number is prime number ");
        }else{
            System.out.println("This number is not prime number");
        }
    }

    public static boolean check_prime(int num){
        if(num == 0)return false;

        int i = 1 , fact = 0;
        boolean ans = false;

        while (num > 0) {
            if (num % i == 0) fact++;
            if (fact == 2) ans = true;
            i++;
            num--;
        }
        return ans;
    }
}
