
import java.util.Arrays;
import java.util.Random;

public class GenerarCasos {

    public static void main(String[] args) {
        //System.out.println("CASO 1");
        generarCaso1();
        //System.out.println("CASO 2");
        generarCaso2();
        //System.out.println("CASO 3");
        generarCaso3();
        //System.out.println("CASO 4");
        generarCaso4();
        //System.out.println("CASO 5");
        generarCaso5();
        //System.out.println("CASO 6");
        generarCaso6();
        generarCaso7();
    }

    /**
     * Caso 1. Tal que el arreglo se encuentre ordenado de manera ascendente,
     * incluyendo numeros repetidos. Input: [1, 2, 3, 4, 5] o [4, 10, 12, 27].
     * Imprime 20 veces el caso correspondiente.
     */
    public static void generarCaso1() {
        Random random = new Random();
        boolean control = true;
        for (int i = 0; i < 20; i++) {
            if (control) {
                int[] array = random.ints(1, 101).limit(random.nextInt(100) + 1).sorted().toArray();
                control = false;
                System.out.println(ArrayToString(array));
            } else {
                int[] array = random.ints(1, 101).limit(random.nextInt(100) + 1).distinct().sorted().toArray();
                control = true;
                System.out.println(ArrayToString(array));
            }
        }
    }

    /**
     * Caso 2, Tal que el arreglo se encuentre ordenado de manera descendente
     * Input: [5, 4, 3, 2, 1] Imprime 20 veces el caso correspondiente.
     */
    public static void generarCaso2() {
        Random random = new Random();
        boolean permitirDuplicados = false; // variable de control
        for (int i = 0; i < 20; i++) {
            int[] array;
            if (permitirDuplicados) {
                array = random.ints(1, 101).limit(random.nextInt(98) + 3).toArray();
            } else {
                array = random.ints(1, 101).distinct().limit(random.nextInt(98) + 3).toArray();
            }
            Arrays.sort(array);
            for (int j = 0; j < array.length / 2; j++) {
                int temp = array[j];
                array[j] = array[array.length - j - 1];
                array[array.length - j - 1] = temp;
            }
            System.out.println(ArrayToString(array));
            permitirDuplicados = !permitirDuplicados; // alternar permitirDuplicados
        }
    }

    /**
     * Caso 3, Tal que el arreglo se encuentre desordenado. Input: [5, 2, 3, 1,
     * 4] Imprime 10 veces el caso correspondiente.
     */
    public static void generarCaso3() {
        Random random = new Random();
        boolean control = true;

        for (int i = 0; i < 10; i++) {
            if (control) {
                int array[] = random.ints(1, 101).distinct().limit(random.nextInt(98) + 3).toArray();
                control = false;
                System.out.println(ArrayToString(array));
            } else {
                int array[] = random.ints(1, 101).limit(random.nextInt(98) + 3).toArray();
                control = true;
                System.out.println(ArrayToString(array));
            }
        }
    }

    /**
     * Caso 4, Tal que el arreglo contenga un solo elemento. Input: [2] Imprime
     * 5 veces el caso correspondiente.
     */
    public static void generarCaso4() {
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            int num = random.nextInt(100) + 1;
            int array[] = new int[1];
            array[0] = num;
            System.out.println(ArrayToString(array));
        }
    }

    /**
     * Caso 5, Tal que el arreglo contenga dos elementos. Input: [2,3] Imprime 5
     * veces el caso correspondiente.
     */
    public static void generarCaso5() {
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            int array[] = new int[2];
            array[0] = random.nextInt(100) + 1;
            array[1] = random.nextInt(100) + 1;
            System.out.println(ArrayToString(array));
        }
    }

    /**
     * Caso 6, Tal que el arreglo se encuentre ordenado de manera ascendente y
     * rotado X posiciones Input: [4, 5, 1, 2, 3] o [7, 4, 5, 6] Imprime 20
     * veces el caso correspondiente.
     */
    public static void generarCaso6() {
        Random random = new Random();

        boolean control = true;
        for (int i = 0; i < 20; i++) {
            if (control) {
                int[] array = random.ints(1, 101).limit(random.nextInt(98) + 3).sorted().toArray();
                control = false;
                System.out.println(ArrayToString(rotateArray(array, random.nextInt(100) + 1)));
            } else {
                int[] array = random.ints(1, 101).limit(random.nextInt(98 + 3) + 1).distinct().sorted().toArray();
                control = true;
                System.out.println(ArrayToString(rotateArray(array, random.nextInt(100) + 1)));
            }
        }
    }

    /**
     * Caso 7, Tal que el arreglo se encuentre ordenado de manera ascendente y
     * rotado X posiciones Input: [3, 2, 1, 5, 4] Imprime 20 veces el caso
     * correspondiente.
     */
    public static void generarCaso7() {
        Random random = new Random();
        boolean permitirDuplicados = false; // variable de control
        for (int i = 0; i < 20; i++) {
            int[] array;
            if (permitirDuplicados) {
                array = random.ints(1, 101).limit(random.nextInt(98) + 3).toArray();
            } else {
                array = random.ints(1, 101).distinct().limit(random.nextInt(98) + 3).toArray();
            }
            Arrays.sort(array);
            for (int j = 0; j < array.length / 2; j++) {
                int temp = array[j];
                array[j] = array[array.length - j - 1];
                array[array.length - j - 1] = temp;
            }
            if (i == 19) {
                System.out.print(ArrayToString(rotateArray(array, random.nextInt(100) + 1)));
            } else {
                System.out.println(ArrayToString(rotateArray(array, random.nextInt(100) + 1)));
                permitirDuplicados = !permitirDuplicados;
            }

        }
    }

    /**
     * Rota un array X posiciones.
     *
     * @param arr Arreglo a rotar
     * @param amount Numero de rotaciones
     * @return El arreglo rotado
     */
    private static int[] rotateArray(int[] arr, int amount) {
        int n = arr.length;
        int[] rotatedArr = new int[n];
        for (int i = 0; i < n; i++) {
            rotatedArr[(i + amount) % n] = arr[i];
        }
        return rotatedArr;
    }

    /**
     * Convierte en contenido de un Arreglo a un String.
     *
     * @param arr El arreglo a convertir
     * @return un String con el contenido del arreglo
     */
    public static String ArrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i < arr.length - 1) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

}
