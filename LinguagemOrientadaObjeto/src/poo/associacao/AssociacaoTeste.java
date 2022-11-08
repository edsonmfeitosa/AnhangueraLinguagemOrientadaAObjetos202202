package poo.associacao;


public class AssociacaoTeste {
    public static void main(String[] args) {
        Motor m = new Motor();
        //m.setFatorPotencia(1000);
        Automovel a = new Automovel("Civic", "branca", 
        2009, m);
        System.out.println(a.motor.getFatorPotencia());
        a.acelerar();
        a.acelerar();
        System.out.println(a.motor.getFatorPotencia());
        System.out.println(m.getFatorPotencia());
        Motor m2 = new Motor();
        System.out.println(m2.getFatorPotencia());
        Automovel a2 = new Automovel("fusca", "preto", 1969, m2);
        Pessoa p1 = new Pessoa();
        p1.setNome("Kayky");
        p1.receberCarro(a2);
        p1.receberCarro(a);
        System.out.println(
            p1.MostrarMeusCarros().get(0).
                motor.getFatorPotencia());
        for (Automovel carro : p1.MostrarMeusCarros()) {
            System.out.println("---->" +carro.modelo);
        }
        
    }   
}
