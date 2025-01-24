class Revers{
	public static void main(String[] args){
		int n = 12345;
		
		int re=0;
		int revers=0;
		while(n > 0){
			re = n % 10;
			revers = (revers*10) + re;
			
			n = n /10; // n = 12345 / 10 = 1234.5 [final value n = 1234 because n is integer type variable ]
			//return revers;
		}
		System.out.println("Revers Number is ");
		System.out.println(revers);
	}
}