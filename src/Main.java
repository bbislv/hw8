import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //task 1
        System.out.println("task 1");
        int [] numbers = new int[] {1, 2, 3};

        double [] decimals = {1.57, 7.654, 9.986};

        String [] employeeNames = {"Kate", "Sergey", "Platon"};
        int [] employeeAges = {26, 32, 1};
        double[] employeeSalaries = new double[3];
        employeeSalaries[0] = 1000.0;
        employeeSalaries[1] = 5000.7;
        employeeSalaries [2] = 135.87;

        //task 2
        System.out.println("task 2");
        int [] arr1 = new int[] {1, 2, 3};
        double [] arr2 = {1.57, 7.654, 9.986};
        String [] arr3 = {"apple", "banana", "orange"};

        for (int i = 0; i < arr1.length; i++) {
        System.out.print(arr1 [i]);
        if (i != arr1.length - 1) {
         System.out.print(", ");
        }
        }
        System.out.println();

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2 [i]);
            if (i != arr2.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3 [i]);
            if (i != arr3.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();

        //task 3
        System.out.println("task 3");
        int[] arr4 = new int[] {1, 2, 3};
        double[] arr5 = new double[]{1.57, 7.654, 9.986};
        int[] arr6 = new int[]{4, 5, 6, 7, 8};

        System.out.println("arr4 в обратном порядке");
        for (int i = arr4.length - 1; i >= 0; i--) {
            System.out.print(arr4[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.println("arr5 в обратном порядке");
        for (int i = arr5.length - 1; i >= 0; i--) {
            System.out.print(arr5[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.println("arr6 в обратном порядке");
        for (int i = arr6.length - 1; i >= 0; i--) {
            System.out.print(arr6[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }

        System.out.println();

        //task 4
        System.out.println("task 4");

        int[] arr8 = {1, 2, 3, 4, 5, 6};

        for (int i = 0; i < arr8.length; i++) {
            if (arr8[i] % 2 != 0) {
                arr8[i]++;
            }
        }
        System.out.println(Arrays.toString(arr8));
    }
}