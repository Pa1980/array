import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("task 1"); //  task1 ***************************************
        byte[] three = new byte[3];
        three[0] = 1;
        three[1] = 2;
        three[2] = 3;
        System.out.println(Arrays.toString(three));
        System.out.println();
        float[] three2 = {1.57f, 7.654f, 9.986f};
        System.out.println(Arrays.toString(three2));
        System.out.println();
        char[] three3 = {'o', 'n', 'e'};
        System.out.println(Arrays.toString(three3));
        System.out.println();

        System.out.println("task 2"); // task 2 ****************************************
        int i =0;
        while (i < three.length - 1) {
            System.out.print(three[i] + ", ");
            i++;
        }
        System.out.println(three[i]);
        i = 0;
        while (i < three2.length - 1) {
            System.out.print(three2[i] + ", ");
            i++;
        }
        System.out.println(three2[i]);
        i = 0;
        while (i < three3.length - 1) {
            System.out.print(three3[i] + ", ");
            i++;
        }
        System.out.println(three3[i]);
        System.out.println();

        System.out.println("task 3"); // task 3 **********************************
        i = three.length-1;
        while (i > 0) {
            System.out.print(three[i] + ", ");
            i--;
        }
        System.out.println(three[i]);
        i = three2.length-1;
        while (i > 0) {
            System.out.print(three2[i] + ", ");
            i--;
        }
        System.out.println(three2[i]);
        i = three3.length-1;
        while (i > 0) {
            System.out.print(three3[i] + ", ");
            i--;
        }
        System.out.println(three3[i]);
        System.out.println();

        System.out.println("task 4"); // task 4 **********************************
        i = 0;
        while (i < three.length){
            if (three[i]%2 == 0) three[i]++;
            i++;
        }
        System.out.println(Arrays.toString(three));
        System.out.println("End");

    }
}