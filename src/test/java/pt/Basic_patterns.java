package pt;

public class Basic_patterns {
    public static void main(String[] args) {
        solid_rectangle(4,5);
        hollow_rectangle(4,4);
        left_pyramid(4);
        right_pyramid(4);
        diamond_pattern(4);
        buttterfly_pattern(4);

    }
    /*
    *Solid rectangle
     * * * *
     * * * *
     * * * *
     * * * * */
    public static void solid_rectangle(int n, int m){
        System.out.println("Solid rectangle");
        int row = n;
        int colum = m;
        for(int i = 1 ; i<=n ; i++){
            for(int j = 1 ; j<=m ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    /*
    * Hollow rectangle
     * * * *
     *     *
     *     *
     * * * * */
    public static void hollow_rectangle(int n, int m){
        System.out.println("Hollow rectangle");
        int row = n;
        int colum = m;
        for(int i = 1 ;i<=row ; i++){
            for(int j = 1 ; j <=colum ;j++){
                if(i==1 || j==1 || i==row || j==colum){
                    System.out.print("* ");
                }else System.out.print("  ");
            }
            System.out.println();
        }
    }
    /*
    * Left pyramid
     *
     * *
     * * *
     * * * * */
    public static void left_pyramid(int n){
        System.out.println("Left pyramid");
        int row=n;
        for(int i = 1 ; i<=n ; i++){
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void right_pyramid(int n){
        System.out.println("Right pyramid");
        int row = n;
        for(int i = 1 ; i<=n ; i++){
            for(int j= 1 ; j<=n ; j++){
                if(i+j>=n+1){
                    System.out.print("* ");
                }else System.out.print("  ");
            }
            System.out.println();
        }
    }
    /*
    * Diamond Pattern
          *
        * * *
       * * * * *
     * * * * * * *
       * * * * *
         * * *
           *  */
    public static void diamond_pattern(int n){
        System.out.println("Diamond Pattern");
        int row = n;
        for(int i = 1 ; i<=n*2-1 ; i++){
            for(int j = 1 ; j<=n*2-1 ; j++){
                if(i+j>=n+1 && j-i<=n-1 && i-j<=n-1 && i+j<=n*3-1){
                    System.out.print("* ");
                }else System.out.print("  ");
            }
            System.out.println();
        }
    }
    /*
    * Butterfly Pattern
     *           *
     * *       * *
     * * *   * * *
     * * * * * * *
     * * *   * * *
     * *       * *
     *           * */
    public static void buttterfly_pattern(int n){
        System.out.println("Butterfly Pattern");
        int row =n;
        for(int i = 1 ; i <= n*2-1 ; i++){
            for(int j = 1 ; j <= n*2-1 ; j++){
                if((i>=j && i+j<=n*2) || (i+j>=n*2 && j>=i)){
                    System.out.print("* ");
                }else System.out.print("  ");
            }
            System.out.println();
        }
    }

}
