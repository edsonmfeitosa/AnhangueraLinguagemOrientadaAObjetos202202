package fundamentos;

/**
 *
 * @author edson
 */
public class Operadores {
    public static void main(String[] args) {
        //Operadores relacionais
        String nome = "Edson";
        int x = 3;
        // E -> &&
        // ou -> ||
        System.out.println(
                x != 2 && nome == "edson");
        System.out.println(
            x == 2 || nome.toLowerCase().equals("edson"));
        
        //Operadores de atribuição
        x += 2; // mesma coisa que x = x + 2
        System.out.println(x);
        int z = 1;
        System.out.println("z: "+ ++z);
        System.out.println("z: "+ z++);
       
        //Tipos de operadores de atribuição
        //unário
        x --;
        //binário
        x = z;
        //ternário
        int n = 2;
        n = x == 3 ? 100 : 500;
        x = 4;
        System.out.println(x == 3? 
                "Sim Senhor" : "Negativo");
        
    }
}
