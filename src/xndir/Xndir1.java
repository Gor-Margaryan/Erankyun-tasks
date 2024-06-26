package xndir;

public class Xndir1 {
    public static void main(String[] args) {
        int[] arr = {123, 22, 4568, 125, 564};
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int number = arr[i];
            int num = 0;
            while (number > 0) {
                num = num * 10 + number % 10;
                number = number / 10;

            }
            result[i] = num;
        }

        for (int i = 0; i < result.length; i++) {
            System.out.print(" " + result[i]);
        }
        System.out.println();
    }
}
