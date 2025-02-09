public class Revers_Recursion {
    public static void main(String[] args){
        int n = 12345;
        System.out.println("This is Revers Number"+revers_num(n));
    }
    
    static int rev = 0;
    public static int revers_num(int n){
        
        int remainder = 0;
        if (n != 0) {
            remainder = n % 10;
            rev = remainder+(rev * 10);
            revers_num(n/10);
        }

        return rev;
    }
}
