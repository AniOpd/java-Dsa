import java.util.*;

public class Striver_Q1_1_1 {

    public static void setMatrixZero(int[][] arr) {
        int col0 = 1, row = arr.length, col = arr[0].length;
        for (int i = 0; i < row; i++) {
            if (arr[i][0] == 0)
                col0 = 0;
            for (int j = 0; j < col; j++) {
                if (arr[i][j] == 0) {
                    arr[i][0] = arr[0][j] = 0;

                }
            }
        }
        for (int i = row - 1; i >= 1; i--) {
            for (int j = col - 1; j >= 1; j--) {
                if (arr[i][0] == 0 || arr[0][j] == 0) {
                    arr[i][j] = 0;
                }
                if (col0 == 0) {
                    arr[i][0] = 0;
                }
            }
        }
    }

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int n, m;
        System.out.println("Enter the no of rows and coloums");
        n = sc.nextInt();
        m = sc.nextInt();
        System.out.println("Enter the elemnts of matrix");
        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix befor seting zeros");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        setMatrixZero(matrix);
        System.out.println("matrix after seting zeros");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
