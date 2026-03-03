package academydevdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main (String[] args) {

        /* Exercício:
        *
        * Quanto pagar de imposto na holanda em relação ao salário anual, onde:
        *
        * De € 0,0 à    € 34.712,0; 9.70%  - Range1
        * De € 34.713 à € 68.507,0; 37.35% - Range2
        * De € 68.508 em diante;    49.50% - Range3
        * */

        double sal = 25000;
        double res;

        if (sal <= 34712) {
            res = sal * 0.097;
        } else if (sal <= 68507){
            res = sal * 0.3735;
        } else {
            res = sal * 0.4950;
        }
        System.out.println("Deve pagar € "+res+" de imposto");
    }
}