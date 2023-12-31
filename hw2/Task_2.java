// 2) Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

package hw2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Task_2 {
    public static void main(String[] args) throws SecurityException, IOException {
        int[] array = new int[] { 5, 7, 2, 23, 4, 56,6,2 };
        String result = Arrays.toString(SortBy(array));
        System.out.println(result);
    }

    static int[] SortBy(int[] listForSort) throws SecurityException, IOException {
        String pathFile = "F:\\Java\\HW_Java\\hw2\\log.txt";
        for (int j = listForSort.length - 1; j >= 1; j--) {
            for (int i = 0; i < j; i++) {
                if (listForSort[i] > listForSort[i + 1]) {
                    int temp = listForSort[i];
                    listForSort[i] = listForSort[i + 1];
                    listForSort[i + 1] = temp;
                }
                addListToFile(listForSort, pathFile);
            }
        }
        return listForSort;
    }

    static void addListToFile(int[] list, String pathToLogFile) throws SecurityException, IOException {
        try {
            File myFile = new File(pathToLogFile);
            FileWriter writer = new FileWriter(myFile, true);

            writer.write(Arrays.toString(list) + "\n");

            writer.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}