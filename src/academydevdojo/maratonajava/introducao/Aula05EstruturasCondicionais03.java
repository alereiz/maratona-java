package academydevdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main (String[] args) {

        //Teste do Operador Ternário.
        //Condição: Se salário > 10000, posso comprar um MacBook.

        //Modo Padrão:
        double sal = 11000;
        String msgComprar = "Posso comprar um MacBook (Modo Padrão).";
        String msgNComprar = "Ainda não tenho condições, mas terei (Modo Padrão).";
        String msg;

        if(sal >= 10000) {
            msg = msgComprar;
        } else {
            msg = msgNComprar;
        }
        System.out.println(msg);

        //Modo Operador Ternário; Sintaxe: (Condição) ? Verdadeiro : Falso;
        String msgComprarT = "Posso comprar um MacBook (Modo Ternário).";
        String msgNComprarT = "Ainda não tenho condições, mas terei (Modo Ternário).";

        String msgT = (sal >= 10000) ? msgComprarT : msgNComprarT;
        System.out.println(msgT);
    }
}