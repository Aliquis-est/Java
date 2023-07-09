package hw3;

// Пусть дан произвольный список целых чисел.
// 1) Нужно удалить из него чётные числа
// 2) Найти минимальное значение
// 3) Найти максимальное значение
// 4) Найти среднее ариф. значение

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task_1 {

    static void DeleteNum(List<Integer> arrList) {
        for (int i=0; i < arrList.size()-1; i++) {
            if (arrList.get(i) % 2 == 0) {
                arrList.remove(i);
            }
        } 
        System.out.println("Остаток после удаления чётных: " + arrList);
        
    }
    static Integer MaxNum(List<Integer> arrList) {
        int max = arrList.get(0); 
        for (int i=0; i < arrList.size()-1; i++) {
            if (arrList.get(i) > max) {
                max = arrList.get(i);
            }
        } 
        System.out.println("Максимальное число: " + max);
        return max;

    }
    static Integer MinNum(List<Integer> arrList) {
        int min = arrList.get(0); 
        for (int i=0; i < arrList.size()-1; i++) {
            if (arrList.get(i) < min) {
                min = arrList.get(i);
            }
        } 
        System.out.println("Минимальное число: " + min);
        return min;
    }
     static Double Midl(List<Integer> arrList) {
        int sum = 0; 
        double midl;
        for (int i=0; i < arrList.size()-1; i++) {
            sum += arrList.get(i);
        } 
        midl = sum / arrList.size();

        System.out.println("Среднее значение: " + midl);
        return midl;
    }
    
    public static void main(String[] args) {
        List<Integer> list_num = new ArrayList(Arrays.asList(5, 41, 5, 14, 37, 30, 1, 12));
        System.out.println("Список чисел: " + list_num);
        MinNum(list_num);
        MaxNum(list_num);
        Midl(list_num);
        DeleteNum(list_num);
    }
}