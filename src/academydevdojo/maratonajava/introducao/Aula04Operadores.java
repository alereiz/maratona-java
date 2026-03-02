package academydevdojo.maratonajava.introducao;

public class Aula04Operadores {
    // + - * /
    public static void main (String[] args){

        double num1 = 7;
        double num2 = 23;

        double resSum = num1 + num2;
        double resSub = num1 - num2;
        double resMul = num1 * num2;
        double resDiv = num1 / num2;

        System.out.println(resSum);
        System.out.println(resSub);
        System.out.println(resMul);
        System.out.println(resDiv);

        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);

        //Op. resto (%)
        System.out.println(num1 % 2+", logo é ímpar");

        //Ops. Relacionais: < > <= >= == !=
        boolean is2MaiorQue3  = 2 > 3;
            System.out.println("2 é maior que 3? "+is2MaiorQue3);

        boolean is2MenorQue3  = 2 < 3;
            System.out.println("2 é menor que 3? "+is2MenorQue3);

        boolean is2Igual3     = 2 == 3;
            System.out.println("2 é igual a 3? "+is2Igual3);

        boolean is2Diferente3 = 2 != 3;
            System.out.println("2 é diferente de 3? "+is2Diferente3);
    }
}