public class fact {
    public static int printFact(int n){
        if(n == 0){
            return 1;
        }
        int fact = 1;
        fact = n*printFact(n-1);

        return fact;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Factorial is "+printFact(n));
    
    }
}
