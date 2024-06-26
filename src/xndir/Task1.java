package xndir;

public class Task1 {
    public static void main(String[] args) {
        int[] nums = new int[10];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = 2;
        }
        System.out.print("task 1: ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(" " + nums[i]);
        }
    }
}
