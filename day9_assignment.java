public class day9_assignment {
    public static void main(String[] args) {

        // Q33: Reverse Star Pattern
        System.out.println("Q33: Reverse Star Pattern");
    for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
         System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        // Q34: Reverse Number Triangle
        System.out.println("Q34: Reverse Number Triangle");
        for (int i = 5; i >= 1; i--) {
      for (int j = 1; j <= i; j++) {
                System.out.print(j);
       }
            System.out.println();
        }

        System.out.println();

        // Q35: Repeated Character Pattern
        System.out.println("Q35: Repeated Character Pattern");
        for (int i = 1; i <= 5; i++) {
   for (int j = 1; j <= i; j++) {
          System.out.print((char)('A' + i - 1));
            }
            System.out.println();
        }

        System.out.println();

        // Q36: Hollow Square Pattern
        System.out.println("Q36: Hollow Square Pattern");
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
      if (i == 1 || i == n || j == 1 || j == n) {
                   System.out.print("*");
        } else {
    
    
            System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}