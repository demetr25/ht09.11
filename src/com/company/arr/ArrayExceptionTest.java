package com.company.arr;

public class ArrayExceptionTest {
    public static void main(String[] args) {
        int[] arr = {6, 12, 34, 5, 10};
        printArray(arr, 0, 10);
    }

    public static void printArray(int[] arr, int start, int end) {
        try {
            while (start < end) {
                System.out.println(arr[start]);
                start++;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка. Попытка обращения к несуществующему индексу: " +
                    "текущий индекс = " + start + "; размер массива = " + arr.length + ";");
        }
    }
}
