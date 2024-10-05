package com.dank0851;

import javax.sound.midi.MidiFileFormat;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        printThreeWords();

        checkSumSign();

        printColor();

        compareNumbers();

        System.out.println(summBetween10And20(5,16));

        printInConsolePositiveOrNegative(-1);

        System.out.println( ansverePositiveOrNegativeBoolean(6));

        repeatStringNTines("Жизнь прекрасна так же, как и Валерия Крафт!",1000);

        System.out.println(ansverLeapOrNotYear(32));

        change0to1And1to0InArray();

        makeArrayFrom1To100();

        changeArrayIfLass6();

        makeArrayWithDiagonalOf1(8);

        createArray(5,4);


    }
    /*
    1. Создайте метод printThreeWords(), который при вызове должен отпечатать
    в столбец три слова: Orange, Banana, Apple.
    */
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    /*
    2. Создайте метод checkSumSign(), в теле которого объявите две int переменные
     а и в, и инициализируйте их любыми значениями, которыми захотите.
      Далее метод должен просуммировать эти переменные, и если их сумма больше или
       равна 0, то вывести в консоль сообщение "Сумма положительная",
        в противном случае "Сумма отрицательная";
     */
    public static void checkSumSign(){
        int a = 5;
        int b = 4;
        if (a + b >= 0) System.out.println("Сумма положительная");
        else System.out.println("Сумма отрицательная");
    }

    /*
   3. Создайте метод printColor() в теле которого задайте int переменную value и
   инициализируйте ее любым значением. Если value меньше 0 (0 включительно),
   то в консоль метод должен вывести сообщение "Красный", если лежит в пределах
   от 0 (0 исключительно) до 100 (100 включительно), то "Желтый",
   если больше 100 (100 исключительно) - "Зеленый",
     */
    public static void printColor() {
        int value = 101;
        if (value <= 0) System.out.println("Красный");
        else if (value <= 100) System.out.println("Жёлтый");
        else System.out.println("Зелёный");
    }

    /*
      4. Создайте метод compare Numbers(), в теле которого объявите две int переменные
      а и в, и инициализируйте их любыми значениями, которыми захотите.
              Если а больше или равно в, то необходимо вывести в консоль
      сообщение "а >= b", в противном случае "а < b";
     */
    public static void compareNumbers(){
        int a = 5;
        int b = 5;
        if (a >= b) System.out.println("а >= b");
        else System.out.println("а < b");
    }

    /*
   5. Напишите метод, принимающий на вход два целых числа и проверяющий,
    что их сумма лежит в пределах от 10 до 20 (включительно), если да вернуть true,
    в противном случае - false.
   */
    public static boolean summBetween10And20(int a,int b){

        return (a+b >=10 ) && (a+b <=20);
    }
    /*
     6. Напишите метод, которому в качестве параметра передается целое число,
      метод должен напечатать в консоль, положительное ли число передали или отрицательное.
      Замечание: ноль считаем положительным числом.
     */
    public static void printInConsolePositiveOrNegative(int a)  {
        if (a >= 0) System.out.println("Положельное");
        else System.out.println("Отрицательное");

    }
    /*
    7. Напишите метод, которому в качестве параметра передается целое число. Метод должен вернуть true,
     если число отрицательное, и вернуть false если положительное.
    */
    public static boolean ansverePositiveOrNegativeBoolean(int a){
        return (a>=0);
    }

    /*
    8. Напишите метод, которому в качестве аргументов передается строка и число,
    метод должен отпечатать в консоль указанную строку, указанное количество раз;
    */
    public static void repeatStringNTines(String string, int n){
        for (int i = 0; i < n; i++) {
            System.out.println(string);
        }
    }
    /*
    9. Напишите метод, который определяет, является ли год високосным, и возвращает boolean
     (високосный true, не високосный false). Каждый 4-й год является високосным, кроме каждого 100-го,
     при этом каждый 400-й високосный.
     */
    public static boolean ansverLeapOrNotYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        } else return false;
    }
    /*
    10. Задать целочисленный массив, состоящий из элементов О и 1. Например:
    [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0]. С помощью цикла и условия заменить О на 1, 1 на 0;
    */
    public static void change0to1And1to0InArray(){
        int[] array = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for(int i=0;i<array.length;i++){
            if (array[i] == 0) {
                array[i] = 1;
            }else array[i]= 0;
        }
        System.out.println(Arrays.toString(array));
    }

    /*
    11. Задать пустой целочисленный массив длиной 100. С
    помощью цикла заполнить его значениями 12345678... 100;
    */
    public static void makeArrayFrom1To100(){
        int[] array = new int[100];
        for (int i = 0; i < 100; i++) {
            array[i] = i+1;
        }
        System.out.println(Arrays.toString(array));
    }

    /*
    12. Задать массив [1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1) пройти по нему циклом, и числа меньшие 6
    умножить на 2;
    */
    public static void changeArrayIfLass6(){
        int [] array ={ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6)   {
                array[i]= array[i]*2;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    /*
    13. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью
    цикла (-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
     Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны,
      то есть [0][0], [1][1], [2][2], ..., [n][n];
    */
    public static void makeArrayWithDiagonalOf1(int a){
        int[][] array = new int[a][a];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if ((i == j)|(i == (a - j-1 ))) {
                    array[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
        /*
        14. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа
        int длиной len, каждая ячейка которого равна initialValue.
        */

    public static void createArray(int len, int initialValue) {
        int[] array = new int[len];

        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        System.out.println(Arrays.toString(array));
    }


}





