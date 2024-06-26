package xndir;

public class Task4 {
    public static void main(String[] args) {
        System.out.print("task 4: ");
        int[] arr4 = {1698,525,12,5,85,90,63};
        for (int i = 0; i < arr4.length; i++) {
            int number = arr4[i];
            if (number%5 == 0){
                System.out.print(" "+number);
            }
        }
        System.out.println();
    }
}
