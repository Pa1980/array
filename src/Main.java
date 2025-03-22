import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("task 1"); //  task1 ***************************************
        int[] expenses = {15000, 1500, 20000, 2500, 15000};
        int sum = 0;
        for (int i:expenses){
           sum += i;
        }
        System.out.println("Сумма трат за месяц составила "+sum+" рублей\n");

        System.out.println("task 2"); // task 2 ****************************************
        int min = expenses[0], max = 0;
        for (int i : expenses) {
            if (min > i) min = i;
            if (max < i) max = i;
        }
        System.out.println("Минимальная сумма трат за неделю составила "+min+" рублей. Максимальная сумма трат за неделю составила "+max+" рублей");
        System.out.println();

        System.out.println("task 3"); // task 3 **********************************
        float average = 0.0f;
        sum = 0;
        for (int i:expenses){
            sum += i;
        }
        System.out.println("Средняя сумма трат за месяц составила "+(sum/(expenses.length))+" рублей\n");

        System.out.println("task 4"); // task 4 **********************************
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        char c;
        int b = reverseFullName.length-1;
        for (int a = 0; a <= (reverseFullName.length / 2)-1; a ++){  // в массиве первые элементы меняются с последними, цикл работает до середины длины массива
            c = reverseFullName[b];
            reverseFullName[b] = reverseFullName[a];
            reverseFullName[a] = c;
            b --;

        }
        System.out.println(Arrays.toString(reverseFullName));
        System.out.println("End");

    }
}