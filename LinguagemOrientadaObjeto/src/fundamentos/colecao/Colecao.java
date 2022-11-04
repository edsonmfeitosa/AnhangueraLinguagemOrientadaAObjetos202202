package fundamentos.colecao;

import java.util.ArrayList;
import java.util.Scanner;
import poo.Pessoa;

public class Colecao {
    public static void main(String[] args) {
        //array
        /*
        int[] numeros = new int[4];
        Pessoa[] alunos = new Pessoa[40];
        
        Pessoa l = new Pessoa();
        l.setNome("Lucas");
        Pessoa x = new Pessoa();
        x.setNome("Penelope");
        Pessoa y = new Pessoa();
        y.setNome("Eduardo");
        Pessoa p2 = new Pessoa();
        p2.setNome("Gustavo");
        alunos[0] = l;
        alunos[1] = x;
        alunos[2] = y;
        alunos[3] = p2;
        
        Scanner tec = new Scanner(System.in);
        int cont = 0;
        while(cont < 4){
            Pessoa p = new Pessoa();
            System.out.println("Digite o nome");
            p.setNome(tec.nextLine());
            alunos[cont] = p;
            cont++;
        }
        for (int i = 0; i < 4; i++) {
            System.out.println(alunos[i].getNome());
        }
        tec.close();
        */
        
        /*
        //Lista
        ArrayList<String> nomes = new ArrayList<>();
        //add - adiciona na lista
        nomes.add("Penelope");
        nomes.add("Eduardo");
        nomes.add("Lucas");
        nomes.add("Gustavo");
        System.out.println(nomes);
        nomes.add(1, "Edson");
        System.out.println(nomes);
        //contains - verifica se existe 
        boolean resp = nomes.contains("Gustavo");
        System.out.println(resp);
        //get  - pegar um registro específico
        System.out.println(nomes.get(3));
        
        System.out.println(
                "Posição do Gustavo: "+ 
                        nomes.indexOf("Gustavo"));
        nomes.remove("Edson");
        System.out.println(nomes);
        nomes.remove(3);
        nomes.set(0, "Maria");
        System.out.println(nomes);
        System.out.println("Qtd: "+ nomes.size());
        System.out.println(nomes);
        */
        Fornecedor f = new Fornecedor();
        f.setNome("Bic");
        Produto p1 = new Produto();
        p1.setNome("caneta");
        p1.setValor(1.0);
        Produto p2 = new Produto();
        p2.setNome("lapis");
        p2.setValor(0.5);
        Produto p3 = new Produto();
        p3.setNome("isqueiro");
        p3.setValor(7.0);
        f.setProduto(p1);
        f.setProduto(p2);
        f.setProduto(p3);
        Fornecedor f2 = new Fornecedor();
        f2.setNome("hp");
        Produto p4 = new Produto();
        p4.setNome("notebook");
        f2.setProduto(p4);
        f2.setProduto(p1);
        ArrayList<Fornecedor> forn = new ArrayList<>();
        forn.add(f);
        forn.add(f2);
        //foreach
        for (Fornecedor fornecedor : forn) {
            System.out.println("Fornecedor: "+
                    fornecedor.getNome());
            for (Produto produto : fornecedor.getProdutos()) {
                System.out.println("------> Produto: "+
                        produto.getNome());
            }
        }
    }   
}
