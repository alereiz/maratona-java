package academydevdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao03 {
    public static void main (String[] args) {

        /*
        * (Uso do break em laços)
        *
        * Imprima os 25 primeiros valores de um dado número: Ex, 50.
        * */

        int vMax = 50;
        for (int i = 0; i <= vMax; i++){
            if (i > 25) {
                break;
            }
            System.out.println("i = "+i);
        }
    }
}
