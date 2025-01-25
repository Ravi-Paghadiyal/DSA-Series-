import java.util.*;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number to check  Number is Prime or Not ");
        int n = sc.nextInt();

        int fact=0;
        for(int i=1; i<=n; i++){
            if(n % i == 0){
                fact++;
            }
        }
        if(fact == 2){
            System.out.println(n+" is Prime Number");
        }else{
            System.out.println(n+" is not Prime Number");
        }
        sc.close();
    }
}
