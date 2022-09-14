package poo;

public class AreaCirc {
    public final static double pi = 3.14;
    private double raio;
    
    public AreaCirc(double raio){
        //this.pi = pi;
        this.raio = raio;
    }
    public AreaCirc(){
        
    }
    public AreaCirc(int pi, double raio){
        
    }
    
    public double calcular(){
        //return pi * raio * raio;
        return pi * Math.pow(raio, 2);
    }
    public static double calcular(double raio){
        return pi * raio * raio;
    }
    
    public static double getPi() {
        return pi;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    
}
