package erankyun;

public class Erankyun4 {
    public static void main(String[] args) {
        int[][] aa = {{1, 7, 9, 8}, {0, 6, 2, 0}, {1, 6, 3, 5}, {8, 1, 0, 7}};
        for (int i = 0; i < aa.length; i++) {
            for (int j = 0; j < aa[i].length; j++) {
                if (i < aa.length / 2 && j >= aa[i].length-1-i || i >= aa.length/2 && i <=j ) {
                    System.out.print("   " + aa[i][j]);
                } else {
                    System.out.print("    ");
                }


            }
            System.out.println();
        }
    }
}