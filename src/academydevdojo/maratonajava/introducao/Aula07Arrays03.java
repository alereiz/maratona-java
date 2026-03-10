package academydevdojo.maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main (String[] args) {

        int[] nums = new int[3];
        int[] nums1 = {11, 22, 33};
        int[] nums2 = new int[]{40, 41, 42};

        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;

        for (int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
        }

        for (int i = 0; i < nums1.length; i++){
            System.out.println(nums1[i]);
        }

        for (int i : nums2){
            System.out.println(i);

            /*
            * Por detrás dos panos:
            *
            * O foreach usa uma variável de referência (i) e faz as seguintes coisas:
            * i = nums2[0]
            * System.out.println(i) - 1º iteração (40)
            * i = nums2[1]
            * System.out.println(i) - 2º iteração (41)
            * i = nums2[2]
            * System.out.println(i) - 3º iteração (42)
            *
            * E como 'i' é uma variável de referência, ela precisa ser do mesmo tipo do array.
            * */
        }
    }
}