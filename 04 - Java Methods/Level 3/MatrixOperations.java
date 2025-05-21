import java.util.Random;

public class MatrixOperations {

    public static double[][] generateMatrix(int rows, int cols) {
        Random rand = new Random();
        double[][] matrix = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(10) + 1;
            }
        }
        return matrix;
    }

    public static double[][] addMatrices(double[][] A, double[][] B) {
        int rows = A.length, cols = A[0].length;
        double[][] result = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] + B[i][j];
            }
        }
        return result;
    }

    public static double[][] subtractMatrices(double[][] A, double[][] B) {
        int rows = A.length, cols = A[0].length;
        double[][] result = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] - B[i][j];
            }
        }
        return result;
    }

    public static double[][] multiplyMatrices(double[][] A, double[][] B) {
        int rows = A.length, cols = B[0].length, common = B.length;
        double[][] result = new double[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k = 0; k < common; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return result;
    }

    public static double[][] transposeMatrix(double[][] A) {
        int rows = A.length, cols = A[0].length;
        double[][] transpose = new double[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = A[i][j];
            }
        }
        return transpose;
    }

    public static double determinant(double[][] A) {
        int n = A.length;
        if (n == 2) {
            return A[0][0] * A[1][1] - A[0][1] * A[1][0];
        } else if (n == 3) {
            return A[0][0] * (A[1][1] * A[2][2] - A[1][2] * A[2][1])
                 - A[0][1] * (A[1][0] * A[2][2] - A[1][2] * A[2][0])
                 + A[0][2] * (A[1][0] * A[2][1] - A[1][1] * A[2][0]);
        }
        return 0;
    }

    public static double[][] inverse2x2(double[][] A) {
        double det = determinant(A);
        if (det == 0) {
            System.out.println("Inverse does not exist (determinant = 0)");
            return null;
        }
        double[][] inverse = {
            { A[1][1] / det, -A[0][1] / det },
            { -A[1][0] / det, A[0][0] / det }
        };
        return inverse;
    }

    public static double[][] inverse3x3(double[][] A) {
        double det = determinant(A);
        if (det == 0) {
            System.out.println("Inverse does not exist (determinant = 0)");
            return null;
        }

        double[][] result = new double[3][3];

        // Cofactor matrix
        result[0][0] = (A[1][1]*A[2][2] - A[1][2]*A[2][1]);
        result[0][1] = -(A[1][0]*A[2][2] - A[1][2]*A[2][0]);
        result[0][2] = (A[1][0]*A[2][1] - A[1][1]*A[2][0]);

        result[1][0] = -(A[0][1]*A[2][2] - A[0][2]*A[2][1]);
        result[1][1] = (A[0][0]*A[2][2] - A[0][2]*A[2][0]);
        result[1][2] = -(A[0][0]*A[2][1] - A[0][1]*A[2][0]);

        result[2][0] = (A[0][1]*A[1][2] - A[0][2]*A[1][1]);
        result[2][1] = -(A[0][0]*A[1][2] - A[0][2]*A[1][0]);
        result[2][2] = (A[0][0]*A[1][1] - A[0][1]*A[1][0]);

        // Transpose the cofactor (adjugate)
        result = transposeMatrix(result);

        // Divide by determinant
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = result[i][j] / det;
            }
        }

        return result;
    }

    public static void displayMatrix(double[][] matrix, String name) {
        System.out.println("\n" + name + ":");
        for (double[] row : matrix) {
            for (double value : row) {
                System.out.printf("%8.2f", value);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int rows = 3, cols = 3;
        double[][] A = generateMatrix(rows, cols);
        double[][] B = generateMatrix(rows, cols);

        displayMatrix(A, "Matrix A");
        displayMatrix(B, "Matrix B");

        displayMatrix(addMatrices(A, B), "A + B");
        displayMatrix(subtractMatrices(A, B), "A - B");
        displayMatrix(multiplyMatrices(A, B), "A * B");
        displayMatrix(transposeMatrix(A), "Transpose of A");

        if (rows == cols) {
            double det = determinant(A);
            System.out.println("\nDeterminant of A: " + det);
            if (rows == 2) {
                double[][] inverse = inverse2x2(A);
                if (inverse != null) {
                    displayMatrix(inverse, "Inverse of A (2x2)");
                }
            } else if (rows == 3) {
                double[][] inverse = inverse3x3(A);
                if (inverse != null) {
                    displayMatrix(inverse, "Inverse of A (3x3)");
                }
            }
        }
    }
}
