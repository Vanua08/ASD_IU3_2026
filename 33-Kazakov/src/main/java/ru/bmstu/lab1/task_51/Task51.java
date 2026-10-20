package ru.bmstu.lab1.task_51;

import java.io.PrintStream;
import java.util.Scanner;

/**
 * Задача 51 — найти максимальный элемент каждой строки матрицы
 */
public class Task51 {

    /**
     * Возвращает максимумы строк непустой прямоугольной матрицы
     */
    public static int[] maxRows(int[][] matrix) {
        int[] maximums = new int[matrix.length];

        for (int row = 0; row < matrix.length; row++) {
            int maximum = matrix[row][0];

            for (int column = 1; column < matrix[row].length; column++) {
                if (matrix[row][column] > maximum) {
                    maximum = matrix[row][column];
                }
            }

            maximums[row] = maximum;
        }

        return maximums;
    }

    /**
     * Считывает матрицу и выводит максимумы строк
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

        for (int maximum : maxRows(matrix)) {
            output.println(maximum);
        }
    }

    public static void main(String[] args) {
        solve(new Scanner(System.in), System.out);
    }
}