package poo;


public class AreaCircTeste {
    public static void main(String[] args) {
        AreaCirc c1 = new AreaCirc(10);
        System.out.println("Resultado: "+ c1.calcular());
        AreaCirc c2 = new AreaCirc();
        //c2.setPi(10);
        //AreaCirc.setPi(3.14);
        c2.setRaio(15);
        System.out.println("Resultado2: "+c2.calcular());
        System.out.println("Resultado: "+ c1.calcular());
        System.out.println(Math.PI);
        System.out.println(AreaCirc.pi);
        System.out.println("Resultado static: "+AreaCirc.calcular(45));
    }
}
