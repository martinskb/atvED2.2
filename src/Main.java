public class Main {
    public static void main(String[] args) {
        int[] numeros = {2, 5, 8, 11, 14, 17, 20, 23, 26, 29};

        for (int i = 0; i < 10; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.println(numeros[i]);
            }
        }
    }
}
