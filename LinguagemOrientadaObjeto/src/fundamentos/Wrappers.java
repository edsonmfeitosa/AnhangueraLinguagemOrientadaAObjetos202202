package fundamentos;

/**
 *
 * @author edson
 */
public class Wrappers {
    public static void main(String[] args) {
        int x = 10;
        Integer z = 10;
        //System.out.println(x);
        //System.out.println(z);
        String y = "20";
        
        x = Integer.parseInt(y);
        System.out.println(x);
        y = Integer.toString(x);
        
        String nome = "Edson Martin Feitosa";
        nome = nome.substring(0, 5);
        
        System.out.println("O nome "+nome.toUpperCase()+" tem "+
                nome.length() + " caracteres");
    }
}
