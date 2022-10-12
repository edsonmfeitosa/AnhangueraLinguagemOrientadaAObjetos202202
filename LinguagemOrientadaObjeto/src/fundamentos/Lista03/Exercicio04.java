package fundamentos.Lista03;

import java.util.Scanner;

/*
4)	Entrar com 5 números e mostrar na saída qual 
    é o menor e qual e o maior número.
 */
public class Exercicio04 {

    public static void main(String[] args) {
        double menor, maior, num;
        Scanner t = new Scanner(System.in);
        System.out.println("Digite o 1º número");
        menor = t.nextDouble();
        maior = menor;
        System.out.println("Digite o 2º número");
        num = t.nextDouble();
        if (num < menor) {
            menor = num;
        }
        if (num > maior) {
            maior = num;
        }
        System.out.println("Digite o 3º número");
        num = t.nextDouble();
        if (num < menor) {
            menor = num;
        }
        if (num > maior) {
            maior = num;
        }
        System.out.println("Digite o 4º número");
        num = t.nextDouble();
        if (num < menor) {
            menor = num;
        }
        if (num > maior) {
            maior = num;
        }
        System.out.println("Digite o 5º número");
        num = t.nextDouble();
        if (num < menor) {
            menor = num;
        }
        if (num > maior) {
            maior = num;
        }
        System.out.println("O menor número digitado foi "+
                menor);
        System.out.println("O maior número digitado foi "+
                maior);
        t.close();
    }
}
