import java.util.Arrays;

public class main {

    public static void main(String[] args) {
        // 1 задание
        printThreeWords();
        // 2 задание
        checkSumSign();
        // 3 задание
        printColor();
        // 4 задание
        compareNumbers();
        // 5 задание
        System.out.println(calculateNum(5, 8));
        // 6 задание
        numFull(-1);
        // 7 задание
        System.out.println(numText(1));

        // 8 задание
        strokaChislo();



        // 9 задание
        printYear(2024);
        //10 задание
        сhangesArray();
        //11 задание
        System.out.println(Arrays.toString(massiveArray()));
        //12 задание
        System.out.println(Arrays.toString(
                changeArray(new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1})));
        //13 задание
        arrDiagonal(5);
        //14 задание
        leniniVal(5, 4);




    }

    // 1 задание

    public static void printThreeWords() {
        System.out.println("1 задание");
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    //2 задание
    public static void checkSumSign() {
        System.out.println("2 задание");
        int a = 1;
        int b = 2;
        int c = a + b;
        if (c >= 0) System.out.println("Сумма положительная");
        else System.out.println("Сумма отрицательная");
        System.out.println();
    }

    //3 задание
    public static void printColor() {
        System.out.println("3 задание");
        int value = 919;
        if (value <= 0) System.out.println("Красный");
        else if (value > 0 && value <= 100) System.out.println("Желтый");
        System.out.println("Зеленый");
        System.out.println();
    }

    //4 задание
    public static void compareNumbers() {
        System.out.println("4 задание");
        int a = 20;
        int b = 15;
        if (a >= b) System.out.println("a>=b");
        else System.out.println("a<b");
        System.out.println();
    }

    //5 задание
    static boolean calculateNum(int a, int b) {
        System.out.println("5 задание");
        int sum = a + b;
        if (sum > 10 && sum < 20) return true;
        else return false;
    }


    //6 задание
    static void numFull(int a) {
        ;
        System.out.println("6 задание");
        if (a >= 0) System.out.println("положительное");
        else System.out.println("отрицательное");
    }

    //7 задание
    static boolean numText(int a) {
        System.out.println("7 задание");
        if (a < 0) return true;
        else return false;

    }
    //8 задание
    public static void strokaChislo() {
        System.out.println("8 задание");
        int chislo = 4;
        int stroka = 1;
        while (true) {
            System.out.println("Строка" + stroka);
            if (stroka >= chislo) {
                break;
            }
            stroka++;
        }
    }
    //9 задание
    static void printYear(int year) {
        System.out.println("9 задание");
        if ((year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0)))
            System.out.println(year + " г. не високосный");
        else System.out.println(year + " г. високосный");
    }

    //10 задание
    static void сhangesArray() {
        System.out.println("10 задание");
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++)
            array[i] = 1 - array[i];
        System.out.println(Arrays.toString(array));

    }

    //11 задание
    static int[] massiveArray() {
        System.out.println("11 задание");
        int[] array = new int[100];
        for (int i = 0, j = 0; i < array.length; i++, j += 1)
            array[i] = j;
        return array;
    }

    //12 задание
    static int[] changeArray(int[] array) {
        System.out.println("12 задание");
        for (int i = 0; i < array.length; i++)
            if (array[i] < 6)
                array[i] *= 2;
        return array;
    }

    //13 задание
    static void arrDiagonal(int size) {
        System.out.println("13 задание");
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            matrix[i][i] = 1;
            matrix[i][size - i - 1] = 1;
        }
        System.out.println(Arrays.deepToString(matrix));
        for (int i = 0; i < size; i++)
            System.out.println(Arrays.toString(matrix[i]));
    }

    //14 задание
    public static void leniniVal(int len, int initialValue) {
        System.out.println("14 задание");
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.print("[" + i + "]" + arr[i] + " ");
        }
    }


}
