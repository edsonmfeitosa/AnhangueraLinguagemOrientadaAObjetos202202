package fundamentos.Lista03;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        int  menor, meio, maior, numero;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o 1º número");
        numero = teclado.nextInt();
        menor = numero;
        meio = numero;
        maior = numero;
        System.out.println("Digite o 2º número");
        numero = teclado.nextInt();
        if (numero < menor) {
            menor = numero;
        }
        else if (numero < meio) {
            meio = numero;
        }
        else{
            maior = numero;
        }
        System.out.println("Digite o 3º número");
        numero = teclado.nextInt();
        if (numero > maior) {
            menor = meio;
            meio = maior;
            maior = numero;
        } else if (numero > meio) {
            menor = meio;
            meio = numero;
        }else{
            maior = meio;
            meio = menor;
            menor = numero;
            
        }
        System.out.println(menor + " - " + meio + " - " + maior);
        teclado.close();
    }
}
