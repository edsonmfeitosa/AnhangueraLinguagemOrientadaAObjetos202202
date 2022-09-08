package poo;

/**
 *
 * @author edson
 */
public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        //p1.nome = "Edson";
        p1.setNome("Edson");
        //p1.telefone = "15 32254465";
        p1.setTelefone("15 32254465");
        p1.idade = 25;
        
        var p2 = new Pessoa();
        //p2.nome = "Brandon";
        p2.setNome("Brandon");
        p1.perguntarONome(p2);
        //p2.responderONome();

        
        

    }
}
