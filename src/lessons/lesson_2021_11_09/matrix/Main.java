package lessons.lesson_2021_11_09.matrix;


import java.util.Scanner;

class Matrix {
    int height; // высота
    int weight; // ширина
    double[][] matrix;

    public Matrix(int height, int weight) {
        this.height = height;
        this.weight = weight;
        this.matrix = new double[height][weight];
    }

    public void fillFromKeyboard(Scanner in) {
        System.out.println("Input matrix:");
        for (int i = 0; i < weight; i++) {
            for (int j = 0; j < height; j++) {
                matrix[i][j] = in.nextDouble();
            }
        }
    }

    public Matrix add(Matrix matrix2) {
        Matrix matrix_ans = new Matrix(this.height, this.weight); // сложение возможно только при одинаковых размерах
        for (int i = 0; i < matrix_ans.height; i++) {
            for (int j = 0; j < matrix_ans.weight; j++) {
                matrix_ans.matrix[i][j] = this.matrix[i][j] + matrix2.matrix[i][j];
            }
        }
        return matrix_ans;
    }

    public Matrix multiply(int number) {
        Matrix matrix_ans = new Matrix(height, weight);
        for (int i = 0; i < matrix_ans.height; i++) {
            for (int j = 0; j < matrix_ans.weight; j++) {
                matrix_ans.matrix[i][j] = matrix[i][j] * number;
            }
        }
        return matrix_ans;
    }

    public void print() {
        System.out.println("Output matrix:");
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < weight; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public Matrix multiply(Matrix matrix2) {
        Matrix matrix_ans = new Matrix(this.weight, matrix2.height); // умножение возможно только при условии, что число столбцов матрицы 1 равно числу строк матрицы 2
        for (int i = 0; i < matrix_ans.height; i++) {
            for (int j = 0; j < matrix_ans.weight; j++) {
                for (int k = 0; k < this.weight; k++) {
                    matrix_ans.matrix[i][j] += this.matrix[i][k] * matrix2.matrix[k][j];
                }
            }
        }
        return matrix_ans;
    }
}

public class Main {
    public static void main(String[] args) {
        Matrix matrix1 = new Matrix(2, 2);
        Matrix matrix2 = new Matrix(2, 2);

        matrix1.matrix = new double[][]{{12, 17}, {13, 14}};
        matrix2.matrix = new double[][]{{18, 11}, {12, 10}};

        Matrix matrix = matrix1.multiply(matrix2);
        matrix.print();
    }
}
