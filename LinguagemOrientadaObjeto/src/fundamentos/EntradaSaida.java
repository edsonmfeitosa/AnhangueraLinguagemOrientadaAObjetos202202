package fundamentos;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author edson
 */
public class EntradaSaida {
    public static void main(String[] args) {
      /* Exemplo 01 de Entrada e Saída
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
        */
      // Exemplo 02 de Entrada e saída
      String texto;
      double num;
        JOptionPane.showMessageDialog(null, 
                "Exemplo de caixa de texto");
        texto = JOptionPane.showInputDialog(
                "Qual o seu nome?");
        JOptionPane.showMessageDialog(null, 
                "Prazer em conhecê-lo "+ texto);
        num  = Double.parseDouble(JOptionPane.showInputDialog("Digite um número."));
        JOptionPane.showMessageDialog(null, 
                "O número foi "+ num, "Número digitado",
                JOptionPane.QUESTION_MESSAGE);
    }
}
