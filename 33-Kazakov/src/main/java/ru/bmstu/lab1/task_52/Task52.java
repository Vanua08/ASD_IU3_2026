package ru.bmstu.lab1.task_52;

import java.io.PrintStream;
import java.util.Scanner;

/**
 * Задача 52 — найти минимальный элемент каждого столбца матрицы
 */
public class Task52 {

    /**
     * Возвращает минимумы столбцов непустой прямоугольной матрицы
     */
    public static int[] minColumns(int[][] matrix) {
        int columns = matrix[0].length;
        int[] minimums = new int[columns];

        for (int column = 0; column < columns; column++) {
            int minimum = matrix[0][column];

            for (int row = 1; row < matrix.length; row++) {
                if (matrix[row][column] < minimum) {
                    minimum = matrix[row][column];
                }
            }

            minimums[column] = minimum;
        }

        return minimums;
    }

    /**
     * Считывает матрицу и выводит минимумы столбцов
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

        for (int minimum : minColumns(matrix)) {
            output.println(minimum);
        }
    }

    public static void main(String[] args) {
        solve(new Scanner(System.in), System.out);
    }
}