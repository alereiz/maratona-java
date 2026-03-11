package academydevdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais02 {
    public static void main (String[] args) {

        int arrayInt[][] = new int[3][];
        arrayInt[0] = new int[2];
        arrayInt[1] = new int[]{11, 22, 33};
        arrayInt[2] = new int[6];

        // Outra forma de inicialização.
        int arrayInt2[][] = {{0, 0}, {11, 22, 33}, {0, 0, 0, 0, 0, 0}};

        for (int arrBase[] : arrayInt2) {
            System.out.println("\n---");
            for (int i : arrBase) {
                System.out.print(i+" ");
            }
        }
    }
}