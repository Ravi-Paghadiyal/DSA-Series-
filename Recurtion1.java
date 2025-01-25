import java.util.Scanner;

public class Recurtion1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter Size Here - ");
        int n = sc.nextInt();
        System.out.println("The Function Started");
        //This function print revers oder number
        System.out.println("The Revers Number is : ");
        printRev(n);
        //This function print 1 to the condition(10) 
        System.out.println();
        printSt(n);
        sc.close();
    }
    // This is My first Recurtion Example 
    public static void printRev(int n){
        if(n == 0){
         return;
        }
        System.out.println(n);
        printRev(n-1);
    }
    public static void printSt(int n){
        if(n == 0){
         return;
        } else if(n == 10){
            System.out.println(n);
         return;
        }
        System.out.println(n);
        printSt(n+1);
    }
    
    
}
