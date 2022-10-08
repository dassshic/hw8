public class Main {
    public static void main(String[] args) {

        int[] array = new int[30];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int)(Math.random() * 100_001) + 100_000);
        }
        System.out.println("task1");
        int sum = 0;
        for (int item : array) {
            sum = sum + item;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        System.out.println("task2");
        int maxSum = 0;
        int minSum = 200_001;
        for (int value : array) {
            if (value > maxSum) {
                maxSum = value;
            }
        }
        for (int k : array) {
            if (k < minSum) {
                minSum = k;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minSum + " рублей. Максимальная сумма трат за день составила " + maxSum +" рублей");

        System.out.println("task3");
        for (int j : array) {
            sum += j;
        }
        double average = (double)sum / array.length;
        System.out.println("Средняя сумма трат за месяц составила "+ average + " рублей");

        System.out.println("task4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        int length = 0;
        for (int element : reverseFullName)
        {
            length++;
        }
        for (int i = length - 1; i >= 0; i--)
        {
            System.out.print(reverseFullName[i]);
        }
    }
}