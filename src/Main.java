public class Main {

    public static void main(String[] args) {
        // Перше завдання
        int[] arr1 = {1, 2, 2, 3, 4};
        boolean result1 = checkIncreasing(arr1);
        System.out.println("Перше завдання: " + result1);

        // Друге завдання
        fizzBuzz();

        // Трете завдання
        int[] arr2 = {1, 1, 1, 2, 1};
        boolean result2 = canSplitArray(arr2);
        System.out.println("Трете завдання: " + result2);
    }

    // Перше завдання: Перевірка, чи кожен елемент масиву більший або дорівнює попередньому
    public static boolean checkIncreasing(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

    // Друге завдання: Гра FizzBuzz
    public static void fizzBuzz() {
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    // Трете завдання: Перевірка, чи можна розділити масив так, щоб сума чисел в обох частинах була рівною
    public static boolean canSplitArray(int[] arr) {
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }

        if (totalSum % 2 != 0) {
            return false; // Якщо загальна сума непарна, то розділити неможливо
        }

        int currentSum = 0;
        for (int num : arr) {
            currentSum += num;
            if (currentSum == totalSum / 2) {
                return true;
            }
        }
        return false;
    }
}