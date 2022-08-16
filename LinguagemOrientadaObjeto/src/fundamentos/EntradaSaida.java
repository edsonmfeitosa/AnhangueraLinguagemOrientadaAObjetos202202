package fundamentos;

import java.util.Scanner;

/**
 *
 * @author edson
 */
public class EntradaSaida {
    public static void main(String[] args) {
      int idade;
      String nome;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite seu nome");
        nome = teclado.nextLine();
        System.out.println("Nome: "+ nome);
        System.out.println("Qual a sua idade?");
        idade = Integer.parseInt(teclado.nextLine());
        System.out.println("A idade do "+
                nome + " é " +idade);
        System.out.println(Math.pow(2, 3));
        
        teclado.close();
    }
}
