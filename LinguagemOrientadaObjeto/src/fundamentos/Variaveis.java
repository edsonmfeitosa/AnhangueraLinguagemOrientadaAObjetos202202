package fundamentos;

public class Variaveis {
    public static void main(String[] args) {
        byte b = 1;
        short sh = 1000;
        int i = 1000;
        long lo = 10000;
        
        sh = b;
        b = (byte)sh;
        
        float fl = 10.0F;
        // comentário de linha
        double doub = 10.5;
        /*
            Comentário de bloco
            várias informações
        */
        char ch = 'a';
        boolean bo = 6 > 8;
        System.out.println(bo);
    }
}
