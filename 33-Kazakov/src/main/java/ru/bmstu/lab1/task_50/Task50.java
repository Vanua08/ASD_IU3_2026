package ru.bmstu.lab1.task_50;

import java.io.PrintStream;
import java.util.Scanner;

/**
 * Задача 50 — вычислить сумму элементов каждого столбца матрицы
 */
public class Task50 {

    /**
     * Возвращает суммы столбцов непустой прямоугольной матрицы
     */
    public static long[] sumColumns(int[][] matrix) {
        int columns = matrix[0].length;
        long[] sums = new long[columns];

        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < columns; column++) {
                sums[column] += matrix[row][column];
            }
        }

        return sums;
    }

    /**
     * Считывает матрицу и выводит суммы столбцов
     */
    public static void solve(Scanner input, PrintStream output) {
        int rows = input.nextInt();
        int columns = input.nextInt();
        int[][] matrix = new int[rows][columns];

        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                matrix[row][column] = input.nextInt();
            }
        }

        for (long sum : sumColumns(matrix)) {
            output.println(sum);
        }
    }

    public static void main(String[] args) {
        solve(new Scanner(System.in), System.out);
    }
}