package prova;

/**
 *
 * @author edson
 */
public class CorrecaoProvaB1 {
    public static void main(String[] args) {
        int x = 2;
        while (x <= 10) {            
            for (int i = 0; i < 4; i++) {
                if (x % 2 == 0) {
                    x++;
                }
                x++;
                System.out.println(x);
            }
        }

    }
}
