package poo;

public class Pessoa {
    private String nome;
    private String telefone;
    public int idade;
    
    public String getTelefone(){
        return telefone;
    }
    public void setTelefone(String tel){
        telefone = tel;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
       this.nome = nome;
    }
    
    void perguntarONome(Pessoa p1){
        System.out.println("Qual o seu nome?");
        //System.out.println("Meu nome é "+p1.nome);
        p1.responderONome();
    }
    void responderONome(){
        System.out.println("Meu nome é "+nome);
    }
}
