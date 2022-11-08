package poo.associacao;

public class Automovel {
    public String modelo;
    private String cor;
    private int ano;
    public Motor motor;

    public Automovel(String modelo, String cor, int ano, Motor motor) {
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.motor = motor;
    }
    
    public void acelerar(){
        motor.setFatorPotencia(
                motor.getFatorPotencia() + 10
        );
    }
    
}
