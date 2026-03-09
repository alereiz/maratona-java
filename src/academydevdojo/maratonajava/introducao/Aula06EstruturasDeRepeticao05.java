package academydevdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao05 {
    public static void main (String[] args) {

        /*
         * Exercício:
         *
         * Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado.
         * Condição: O valor da parcela >= 1000.
         * */

        double vCar = 2000;

        for (int parc = (int) vCar; parc >= 1; parc--) {
            double vParc = vCar / parc;
            if (vParc < 1000) {
                continue;
            }
            System.out.println("Parcela "+parc+" R$ "+vParc);
        }
    }
}