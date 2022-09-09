package fundamentos.Lista02;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        //4)	Entrar com 5 números e mostrar na 
        //saída qual é o menor e qual e o maior número.
        double menor, maior, numero;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número");
        numero = teclado.nextDouble();
        menor = numero;
        maior = numero;
        System.out.println("Digite um número");
        numero = teclado.nextDouble();
        if (numero < menor) {
            menor = numero;
        }
        if (numero > maior) {
            maior = numero;
        }
        System.out.println("Digite um número");
        numero = teclado.nextDouble();
        if (numero < menor) {
            menor = numero;
        }
        if (numero > maior) {
            maior = numero;
        }System.out.println("Digite um número");
        numero = teclado.nextDouble();
        if (numero < menor) {
            menor = numero;
        }
        if (numero > maior) {
            maior = numero;
        }System.out.println("Digite um número");
        numero = teclado.nextDouble();
        if (numero < menor) {
            menor = numero;
        }
        if (numero > maior) {
            maior = numero;
        }
        System.out.println("O menor é "+menor);
        System.out.println("O maior é "+maior);
        
        teclado.close();
    }
}
