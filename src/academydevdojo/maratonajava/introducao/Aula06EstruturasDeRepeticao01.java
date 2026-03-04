package academydevdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main (String[] args) {

        /*
        * São 3 estruturas:
        * while, do-while e for.
        * */

        // while
        int iWhile = 0;
        while (iWhile < 5) {
            System.out.println(++iWhile+" while");
        }

        // do-while
        int iDoWhile = 10;
        do {
            System.out.println(++iDoWhile+" do-while");
        } while (iDoWhile < 5);

        // for
        for (int iFor = 0; iFor <= 5; iFor++){
            System.out.println(iFor+" for");
        }
    }
}
