package ru.geekbrains.HomeWorkApp_lesson3;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


    }


//1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
//        public static int[] mass01 ( int[] Arr){
//            int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
//            for (int i = 0; i < arr.length; i++) {
//                if (arr[i] == 0) {
//                    arr[i] = 1;
//                } else {
//                    arr[i] = 0;
//                }
//                System.out.println(arr[i]);
//            }
//2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
//        public static int[] mass100 ( int[] Arr){
//            int[] arr = new int[100];
//            for (int i = 0; i < arr.length; i++) {
//                arr[i] = i + 1;
//            }
//            System.out.println(Arrays.toString(arr));
//        }
//3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
//        public static int[] mass62 ( int[] Arr){
//            int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
//            for (int i = 0; i < arr.length; i++) {
//                if (arr[i] < 6) {
//                    arr[i] *= 2;
//                }
//                System.out.println(arr[i]);
//            }
//    4.
//        public static void mass2Quad(int Arr) {
//        int n;
//        n = 4;
//        int[][] arr = new int[n][n];
//        for (int i = 0; i < n; i++) {
//            arr[i][i] = 1;
//            arr[i][n - i - 1] = 1;
//            System.out.println(Arrays.toString(arr[i]));
//        }
//  5. Написать метод, принимающий на вход два аргумента: len и initialValue,
//  и возвращающий одномерный массив типа int длиной len,
//  каждая ячейка которого равна initialValue;
//        public static void massLenInitialValue(int Arr) {
//        int len;
//        len = 8;
//        int initialValue;
//        initialValue = 15;
//        int[] arr = new int[len];
//        for (int i = 0; i < len; i++) {
//            arr[i] = initialValue;
//            System.out.println("arr[" + i + "] = " + arr[i]);
//        }
//        6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
//        public static void massMinMaX ( int Arr){
//            int n;
//            n = 10;
//            int[] arr = new int[n];
//            for (int i = 0; i < n; i++) {
//                arr[i] = i;
//            }
//            System.out.println("arr[" + (n - 1) + "] = " + arr[(n - 1)] + " Максимальное");
//            System.out.println("arr[" + (n - n) + "] = " + arr[(n - n)] + " Минимальное");








