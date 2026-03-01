package academydevdojo.maratonajava.introducao;

public class Aula03TiposPrimitivosExercicio {

    /*  Prática

        Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:
        Eu <nome>, morando no endereço <endereço>,
        confirmo que recebi o salário de <salário>, na data <data>.
     */

    public static void main (String[] args){

        String nome     = "Alexandre G. d. Reis";
        String endereco = "Rua dos Bobos, Nº 0";
        String data     = "01/03/2026";
        double salario  = 25000.0;

        System.out.println("Eu "+nome+", morando no endereço "+endereco+", confirmo que recebi o salário de U$ "
        +salario+", na data de "+data+".");
    }
}