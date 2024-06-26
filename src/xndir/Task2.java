package xndir;

public class Task2 {
    public static void main(String[] args) {
        System.out.println();
        int[] arr1 = new int[100];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = 1 + i;
        }
        System.out.print("task 2: ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(" " + arr1[i]);
        }
        System.out.println();
    }
}
