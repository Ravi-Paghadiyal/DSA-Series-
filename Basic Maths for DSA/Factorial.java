// what is Factorial number?
// A factorial number is the product of all positive integers from 1 to n.
// Ex : 5! -> 5*4*3*2*1 = 120


public class Factorial {
    public static void main(String[] args) {
        int num = 5;
        System.out.println("Factorial is : "+cal_fact(num));
    }

    public static int cal_fact(int num){
        if(num == 0)return num;

        int fact = 1;
        while (num > 0) {
            fact = fact * num;
            num--;
        }
        return fact;
    }
}
