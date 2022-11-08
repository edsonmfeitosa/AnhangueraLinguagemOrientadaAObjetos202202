package poo.associacao;

import java.util.ArrayList;


public class Pessoa {
    private String nome;
    private ArrayList<Automovel> carros = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void receberCarro(Automovel auto){
        carros.add(auto);
    }
    public ArrayList<Automovel> MostrarMeusCarros(){
        return carros;
    }
}
