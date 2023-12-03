package com.teachmeskills.lesson_9.task_2;

/**
 * Доработайте задачу из домашнего задания №5.
 * Умножение двух матриц
 * Создайте два массива целых чисел размером 3х3 (две матрицы).
 * Напишите программу для умножения двух матриц.
 * Первый массив: {{1,0,0,0},{0,1,0,0},{0,0,0,0}}
 * Второй массив: {{1,2,3},{1,1,1},{0,0,0},{2,1,0}}
 * Ожидаемый результат: 1 2 3 1 1 1 0 0 0
 * Создайте класс Utils.
 * Данном классе создайте статический метод для вывода матрицы на экран используюя Syste.out.println.
 * Метод на вход должные принимать двумерный массив, а на выход он не должен ничего возвращать.
 * Используйте этот статический метод в классе для решения задачи умножения матриц.
 * Используйте этот статический метод для вывода матрицы на экран трижды - вывод первой матрицы, вывод второй матрицы, вывод результата.
 */

public class Task_2 {

    public static void main(String[] args) {

        int[][] array1 = {{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 0, 0}};
        System.out.println("First matrix:");
        Utils.showMatrix(array1);
        int[][] array2 = {{1, 2, 3}, {1, 1, 1}, {0, 0, 0}, {2, 1, 0}};
        System.out.println("Second matrix:");
        Utils.showMatrix(array2);

        int newLength1=array1.length;
        int newLength2= array2[0].length;
        int[][] resultArray=new int[newLength1][newLength2];

        System.out.println("Result matrix:");
        for (int i = 0; i < resultArray.length; i++) {
            for (int j = 0; j < resultArray[0].length; j++) {
                for (int k = 0; k < resultArray[0].length; k++) {
                    resultArray[i][j]+=(array1[i][k]*array2[k][j]);
                }
            }
        }
        Utils.showMatrix(resultArray);

    }

}
