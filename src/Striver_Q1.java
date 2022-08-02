import java.util.*;

public class Striver_Q1 {
    public static void setMatrixZero(int[][] arr) {
        int row = arr.length, colomn = arr[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colomn; j++) {
                if (arr[i][j] == 0) {
                    int ind = i - 1;
                    while (ind >= 0) {
                        if (arr[ind][j] != 0) {
                            arr[ind][j] = -1;
                        }
                        ind--;
                    }
                    ind = i + 1;
                    while (ind < row) {
                        if (arr[ind][j] != 0) {
                            arr[ind][j] = -1;
                        }
                        ind++;
                    }
                    ind = j - 1;
                    while (ind >= 0) {
                        if (arr[i][ind] != 0) {
                            arr[i][ind] = -1;
                        }
                        ind--;
                    }
                    ind = j + 1;
                    while (ind < colomn) {
                        if (arr[i][ind] != 0) {
                            arr[i][ind] = -1;
                        }
                        ind++;
                    }
                }
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colomn; j++) {
                if (arr[i][j] == -1) {
                    arr[i][j] = 0;
                }
            }
        }
    }

    public static void main(String ak[]) {
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