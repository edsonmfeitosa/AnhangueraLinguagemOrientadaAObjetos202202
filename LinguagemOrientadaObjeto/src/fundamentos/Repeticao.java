package fundamentos;

public class Repeticao {

    public static void main(String[] args) {
        //while
        int cont = 0;
        while (cont < 10) {
            cont = cont + 1;
            if (cont == 5) {
                continue;
            }
            System.out.println(cont);
            
            if (cont == 7) {
                break;
            }
            
        }

        //do while
        cont = 10;
        do {
            System.out.println("do...while: "+ cont);
            cont --;
        } while (cont >= 1);
        //for
        for (int i = 0; i < 10; i++) {
            System.out.println("Ex.: for: "+(i+1));
        }
    }
}
