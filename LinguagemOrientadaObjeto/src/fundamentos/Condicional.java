package fundamentos;

/**
 *
 * @author edson
 */
public class Condicional {
    public static void main(String[] args) {
        int numero = 10;
        //exemplo de condicional simples
        if (numero > 6) {
            System.out.println("Sim, o número é maior que 6");
        }
        //exemplo de condicional composto
        if (numero == 10) {
            System.out.println("Igual");
        }
        else{
            System.out.println("Diferente");
        }
        //exemplo de condicional encadeado
        if (numero == 1) {
            System.out.println("um");
        }
        else if (numero == 2) {
            System.out.println("dois"); 
        }
        else{
            System.out.println("diferente");
        }
        //Switch
        switch (numero) {
            case 1:
                System.out.println("um");
                break;
            case 2:
                System.out.println("dois");
                break;
            default:
                System.out.println("diferente");
        }
    }
}
