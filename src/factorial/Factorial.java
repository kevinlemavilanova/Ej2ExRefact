package factorial;

public class Factorial {

    public static void main(String[] args) {

        int f = 1;
        int j = 8;
        int i;

        for (i = j; i >= 1; i--) {
            f = f * i;
        }

        System.out.println(f);

    }

}
