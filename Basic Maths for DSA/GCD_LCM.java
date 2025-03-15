public class GCD_LCM {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        gcd_lcm(a, b);
    }

    public static void gcd_lcm(int a , int b){
        if(a == 0 || b == 0) System.out.println("We Can not found GCD and LCM");

        int x = a, y = b;
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        int gcd = a;
        

        int lcm = x*y / gcd;

        System.out.printf("A = "+x+" B = "+y);
        System.out.println();
        System.out.println("GCD = "+gcd);
        System.out.println("LCM = "+lcm);
    }
}
