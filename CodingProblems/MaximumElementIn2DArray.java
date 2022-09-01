package CodingProblems;

import java.util.Scanner;

public class MaximumElementIn2DArray {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size of row: ");
        int row = sc.nextInt();
        System.out.println("Enter a size of column: ");
        int column = sc.nextInt();

        int [][] array2d = new int[row][column];

        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                array2d[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                System.out.print(array2d[i][j] + " ");
            }
            System.out.println();
        }

    }
}
