package math.problems;

public class Fibonacci {

    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */
        int n, a = 0, b = 1, c = 1, d = 2, e = 3, f = 5, g = 8, h = 13;
        System.out.print("Fibonacci Series:");
        for (int i = 1; i <= 40; i++) {
            a = b;
            b = c;
            c = d;
            d = e;
            e = f;
            f = g;
            g = h;
            h = a + b + c + d + e + f + g;

            System.out.print(a + " ");
        }
    }
}