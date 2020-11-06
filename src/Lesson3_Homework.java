public class Lesson3_Homework {
    public static void main(String[] args) {

        System.out.println("Task 1");
        System.out.println("Create an array and fill it with 2 number");

        int[] myArray = new int[10];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = 2;
            System.out.print(myArray[i] + " ");
        }


        System.out.println();
        System.out.println("Task 2");
        System.out.println("Create an array and fill it with numbers from 1:1000");

        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.print(arr[i] + " ");
        }


        System.out.println();
        System.out.println("Task 3");
        System.out.println("Create an array and fill it with odd numbers from -20:20");

        int[] odd = new int[20];
        for (int p = 0, g = -19; p < odd.length; p++, g += 2) {
            odd[p] = g;
            System.out.print(odd[p] + " ");
        }


        System.out.println();
        System.out.println("Task 4");
        System.out.println("Create an array and fill it. Print all elements which can be divided by 5");

        int[] array = {1, 65, 4, 7, 9, 25, 18, 17, -5, -78, 0, 58, 98, 89};
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 5 == 0)
                System.out.print(array[i] + " ");
        }


        System.out.println();
        System.out.println("Task 7");
        System.out.println("Multiplication table");

        int n = 2;
        for (int i = 1; i <= 10; i++) {
            System.out.println("2 x " + i + " = " + n * i);
        }


    }
}
