//  Задание1. Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

package hw1;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = scanner.nextInt();
        scanner.close();
        
        int sum = sum_of_number(n);
        int factorial = factorial(n);
        System.out.println("Сумма чисел от 1 до " + n + " равна " + sum);
        System.out.println("Произведение чисел равно " + factorial);

    }

    static int sum_of_number(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        return sum;
    }

    static int factorial(int number) {
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

}
