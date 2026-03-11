package academydevdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais01 {
    public static void main (String[] args) {

        int[] umaD = {1, 2, 3};
        for (int i : umaD) {
            System.out.println(i);
        }

        int[][] duasD = new int[3][3];
        for (int i = 0; i < duasD.length; i++) {
            for (int j = 0; j < duasD[0].length; j++) {
                System.out.println(duasD[i][j]);
            }
        }
    }
}
