import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = generateRandomArray(30);
        System.out.println("task1");
        int sum = 0;
        for (int item : array) {
            sum = sum + item;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        System.out.println("task2");
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
        for (int k : array) {
            if (k < minSum) minSum = k;
            if (k > maxSum)
                maxSum = k;
        }
        System.out.println("Минимальная сумма трат за день составила " + minSum + " рублей. Максимальная сумма трат за день составила " + maxSum + " рублей");

        System.out.println("task3");
        for (int j : array) {
            sum += j;
        }
        double average = (double) sum / array.length;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");

        System.out.println("task4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
        private static int[] generateRandomArray(int size) {
            int[] array = new int[size];
            Random random = new Random();
            for (int i = 0; i < array.length; i++) {
                array[i] = random.nextInt(100_000, 200_000);
            }
            return array;
        }
    }