package academydevdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {
    public static void main (String[] args) {

        /* Exercício:
        * Dados valores de 1 a 7, imprima se é dia útil ou final de semana.
        * Considerando 1 como domingo.
        * */

        byte dia = 10;
        String dUtil = "Dia útil.";
        String dFin  = "Final de semana.";

        switch (dia) {
            case 1:
                System.out.println("Domingo. "+dFin);
                break;
            case 2:
                System.out.println("Segunda. "+dUtil);
                break;
            case 3:
                System.out.println("Terça. "+dUtil);
                break;
            case 4:
                System.out.println("Quarta. "+dUtil);
                break;
            case 5:
                System.out.println("Quinta. "+dUtil);
                break;
            case 6:
                System.out.println("Sexta. "+dUtil);
                break;
            case 7:
                System.out.println("Sábado. "+dFin);
                break;
            default:
                System.out.println("Digite um dia válido!");
        }
    }
}
