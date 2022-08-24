package fundamentos.Lista01;

/**
 *
 * @author edson
 */
public class Exercicio06 {
    public static void main(String[] args) {
        double supEsq = (Math.pow(6 * (3 + 2), 2)) / (3 * 2);
        double supDir =  Math.pow(((1 - 5) * (2 - 7)) / 2, 2);
        double sup = Math.pow((supEsq - supDir), 3);
        double result = sup / Math.pow(10, 3);
        System.out.println("Resultado: "+ result);
    }
}
