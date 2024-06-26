package xndir;

public class Task5 {
    public static void main(String[] args) {
        System.out.print("task 5: ");
        double[] arr5 = {123.1,12.35,32,-4,-5.32,45};
        for (int i = 0; i < arr5.length ; i++) {
            double num = arr5[i];
            if (num<467.23&&num>24.12){
                System.out.print(" "+num);
            }
        }
        System.out.println();
    }
}
