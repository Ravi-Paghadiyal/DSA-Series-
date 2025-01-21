import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number To Check Number is Armstrong Number or Not :");
        int n = sc.nextInt();

        int temp = n;
        int re = 0;
        int sum =0;

        while(n > 0){
            re = n % 10;
            sum = sum + (re *re*re);
            n = n /10;
        }
        if(sum == temp){
            System.out.println("This is ArmStong Number "+temp);
        }
        else{
            System.out.println("This is not ArmStong Number "+temp);
        }
        sc.close();
    }
}
