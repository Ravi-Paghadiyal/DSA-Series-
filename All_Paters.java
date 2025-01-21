public class All_Paters {
    public static void main(String[] args) {

        // This is First Pattern method 
        System.out.println();
        System.out.println("This is First Pattern :");
        getPattern_1(5);

        // This is Second Pattern method 
        System.out.println();
        System.out.println("This is Second Pattern :");
        getPattern_2(5);

        // This is Third Pattern method 
        System.out.println();
        System.out.println("This is Third Pattern :");
        getPattern_3(5);

         // This is Fourth Pattern method 
         System.out.println();
         System.out.println("This is Foruth Pattern :");
         getPattern_4(5);

         // This is fifth Pattern method 
         System.out.println();
         System.out.println("This is fifth Pattern :");
         getPattern_5(5);

          // This is sixth Pattern method 
          System.out.println();
          System.out.println("This is sixth Pattern :");
          getPattern_6(5);
    }
     public static void getPattern_1(int n){
        if(n == 0){
                System.out.println("Please Enter Number of Rows : ");
                return;
        }

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
     }

     // This is Second Pattern 
     public static void getPattern_2(int n){
        if(n == 0){
                System.out.println("Please Enter Number of Rows : ");
                return;
        }

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
     }

      // This is Third Pattern 
      public static void getPattern_3(int n){
        if(n == 0){
                System.out.println("Please Enter Number of Rows : ");
                return;
        }

        for(int i=5; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
     }

      // This is Fourth Pattern 
      public static void getPattern_4(int n){
        if(n == 0){
                System.out.println("Please Enter Number of Rows : ");
                return;
        }

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
     }

      // This is fifth Pattern 
      public static void getPattern_5(int n){
        if(n == 0){
                System.out.println("Please Enter Number of Rows : ");
                return;
        }

        for(int i=n; i>=1; i--){
            for(int j=n; j>=i; j--){
                System.out.print(j);
            }
            System.out.println();
        }
     }

      // This is fifth Pattern 
      public static void getPattern_6(int n){
        if(n == 0){
                System.out.println("Please Enter Number of Rows : ");
                return;
        }

        int newNn  = n-1;
        for(int i=1; i<=newNn; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");

                // We Are Checking the condition of second
                if (j==newNn) {
                    System.out.println();
                    for(int x=n; x>=1; x--){
                        for(int y=x; y>=1; y--){
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                }
                
            }
            System.out.println();
        }
     }
}
