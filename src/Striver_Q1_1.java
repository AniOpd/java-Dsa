import java.util.*;

public class Striver_Q1_1 {
    public static void setMatrixZero(int[][] arr) {
        int row = arr.length, col = arr[0].length;
        int[] dmi1 = new int[row];
        int[] dmi2 = new int[col];
        Arrays.fill(dmi1, -1);
        Arrays.fill(dmi2, -1);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j] == 0) {
                    dmi1[i] = 0;
                    dmi2[j] = 0;
                }
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (dmi1[i] == 0 || dmi2[j] == 0) {
                    arr[i][j] = 0;
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
