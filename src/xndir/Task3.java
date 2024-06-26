package xndir;

public class Task3 {
    public static void main(String[] args) {
        System.out.print("task 3: ");
        int[] odds = new int[20];
        for (int i = -20, j = 0; i <= 20; i++) {
            if (i % 2 != 0) {
                odds[j++] = i;
            }
        }
        for (int i = 0; i < odds.length; i++) {
            System.out.print(" " + odds[i]);
        }
        System.out.println();
    }
}
