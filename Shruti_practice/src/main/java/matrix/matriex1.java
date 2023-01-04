package matrix;

import java.util.Scanner;

public class matriex1 {
	public static void main(String[] args) {
        int[][] values = { { 1, 2, 3, 4, 5}, { 4, 5,6,8,9 }, { 7, 8,6,5,2} };
         
        System.out.println("Elements are :");
        for(int i=0; i< values.length; i++) {
                for(int j=0; j< values[i].length; j++) {
                        System.out.print(values[i][j] + " ");
                }
                System.out.println("");
        }
}
}
