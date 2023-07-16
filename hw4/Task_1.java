package hw4;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class Task_1 {
    
    static int goToInt(Deque<String> arr) {
        int result = 0;
        String textNum;
        int i = 1;

        while(arr.size() != 0) {
            textNum = arr.pollFirst();
            if (!textNum.equals("-")) {
                result = result + i * (Integer.parseInt(textNum));
                i *= 10;
            } else {
                result *= -1;
            }
        }
        return result;
    }

 
    public static void main(String[] args) {

        Deque<String> list_1 = new LinkedList<>(Arrays.asList("5","2","1"));
        Deque<String> list_2 = new LinkedList<>(Arrays.asList("1","3","-"));
        System.out.println();
        System.out.println("Первое число: " + list_1 + ", " + list_2);

        Deque<String> list_3 = new LinkedList<>(Arrays.asList("5","3"));
        Deque<String> list_4 = new LinkedList<>(Arrays.asList("2","4","1"));
        System.out.println();
    
        System.out.println("Второе число: " + list_3 + ", " + list_4);
        System.out.println();

        int first_num = goToInt(list_1);
        int second_num = goToInt(list_2);
        System.out.println("Результат произведения: " + (first_num * second_num));
      
        first_num = goToInt(list_3);
        second_num = goToInt(list_4);
        System.out.println("Результат суммы: " + (first_num + second_num));
      
    }   
}