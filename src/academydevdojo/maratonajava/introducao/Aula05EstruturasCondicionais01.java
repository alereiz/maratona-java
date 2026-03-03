package academydevdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main (String[] args){

        if(false){
            System.out.println("Dentro do IF");
        }
        System.out.println("Fora do IF");

        // Resultado de condicionais dentro de variáveis booleanas:
        int age = 23;
        boolean isAutorizado = age >= 18;
        if(isAutorizado){
            System.out.println("Autorizado a comprar bebida alcoólica.");
        } else {
            System.out.println("Não autorizado a comprar bebida alcoólica.");
        }


    }
}