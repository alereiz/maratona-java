package academydevdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main (String[] args){

        /*
        * Exercício:
        *
        * Se idade < 15,         imprima: Categoria Infantil.
        * Se idade >= 15 e < 18, imprima: Categoria Juvenil.
        * Se idade >= 18,        imprima: Categoria Adulto.
        * */

        int age = 23;
        String CatInf = "Categoria Infantil";
        String CatJuv = "Categoria Juvenil";
        String CatAdu = "Categoria Adulto";

        if(age < 15) {
            System.out.println(CatInf);
        } else if (age >= 15 && age < 18) {
            System.out.println(CatJuv);
        } else {
            System.out.println(CatAdu);
        }
    }
}