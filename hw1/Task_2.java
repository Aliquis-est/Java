// 2) Вывести все простые числа от 1 до 1000

package hw1;

public class Task_2 {


    public static void main(String[] args) {
        
        int i, j;
        boolean result;

        System.out.println("Простые числа от 1 до 1000:");

        for (i = 2; i <= 1000; i++) {
            result = true;

            for (j = 2; j < i; j++) {
                if (i % j == 0) {
                    result = false;
                    break;
                }
            }

            if (result) {
                System.out.println(i);
            }
        }
    }

}