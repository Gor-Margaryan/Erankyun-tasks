package xndir;

public class Task6 {
    public static void main(String[] args) {
        System.out.print("task 6: ");
        int[] arr6 = {12,3,4,6,8,7,6,-8,15}; //
        for (int i = 0; i < arr6.length; i++) {
            if(arr6[i]%2 == 0){
                System.out.print(" "+arr6[i]);
            }
        }
        System.out.println();
    }
}
