public class Revers_num {
    public static void main(String[] args) {
        int n = 12345;
        System.out.println("Revers Number : "+revers_n(n, 0));
    }

    public static int revers_n(int n,int revere_num){
        if(n == 0){
            return revere_num;
        }

           int rem = n % 10;   
            revere_num = (revere_num*10) + rem;
        
        return revers_n(n/10,revere_num);
    }
}
