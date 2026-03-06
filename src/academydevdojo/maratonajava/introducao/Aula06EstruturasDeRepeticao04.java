package academydevdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    public static void main (String[] args) {

        /*
        * Exercício:
        *
        * Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado.
        * Condição: O valor da parcela >= 1000.
        * */

        double vCar = 37450;

        for (int parc = 1; parc < vCar; parc++) {
            double vParc = vCar / parc;
            if (vParc < 1000) {
                break;
            }
            System.out.println("Parcela "+parc+" R$ "+vParc);
        }
    }
}