package fundamentos.Lista02;



import java.util.Scanner;
//3)	Entrar com um número e informar se ele é 
//divisível por 10, ou é divisível por 5, ou é 
//divisível por 2 ou se não é divisível por nenhum 
//destes.
public class Exercicio03 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        double x;
        System.out.println("Digite um número");
        x = tec.nextDouble();
        if ((x % 10) == 0) {
            System.out.println("o número "+ x +
                    " é divisivel por 10");
        }
        if ((x % 5) == 0) {
            System.out.println("o número "+ x +
                    " é divisivel por 5");
        }
        if ((x % 2) == 0) {
            System.out.println("o número "+ x +
                    " é divisivel por 2");
        }
       
        tec.close();
    }
}
