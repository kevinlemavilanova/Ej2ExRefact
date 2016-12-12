package factorial;

public class Factorial {

    public static long calcFactorial(int f, int j) {
        for (int i = j; i >= 1; i--) {
            f = f * i;
        }
        return f;
    }

    public static void main(String[] args) {

        int factorial = 1;
        int j = 8;
        
        System.out.println(Factorial.calcFactorial(factorial,j));

    }

}
