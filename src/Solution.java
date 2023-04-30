import java.util.Scanner;

class Solution {

    /**
     * Revisa si un arreglo de numeros enteros se encuentra ordenado
     * ascendentemente sin importar que este se encuentre rotado.
     *
     * @param nums, el arreglo con los numeros.
     * @return true, si se encuentra ordenado, false en caso contrario.
     */
    public static boolean check(int[] nums) {
        int n = nums.length;
        int rotacion = 0;
        for (int i = 1; i < n; i++) {
            if (nums[i] < nums[i - 1]) {
                rotacion++;
                if (rotacion > 1) {
                    return false;
                }
            }
        }
        if (rotacion == 1) {
            return nums[n - 1] <= nums[0];
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int casos = 100;

        while (casos != 0) {
            // Leer la entrada del usuario
            String input = scanner.nextLine();
            String[] strNums = input.split(",");
            int[] nums = new int[strNums.length];
            for (int i = 0; i < strNums.length; i++) {
                nums[i] = Integer.parseInt(strNums[i]);
            }
            // Imprimir la salida
            System.out.println(check(nums));
            casos--;
        }
    }
}
