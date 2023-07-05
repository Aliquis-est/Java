package hw2;

import java.io.File;

// 1) Напишите метод, который определит тип (расширение) файлов из текущей папки и выведет в консоль результат вида
    // 1 Расширение файла: txt
    // 2 Расширение файла: pdf
    // 3 Расширение файла:
    // 4 Расширение файла: jpg

public class Task_1 {
    
  public static void main(String[] args) {
        String directory = "F:\\Java\\HW_Java\\hw2";
        System.out.println(directory);
        String[] catalog = getFileList(directory);
        Extension(catalog);

    }

    static String[] getFileList(String directory) {
        File currentList = new File(directory);
        return currentList.list();
    }

    static void Extension(String[] fileList) {
        for (int i = 0; i < fileList.length; i++) {
            int index = fileList[i].indexOf(".");
            String result = "Расширение файла: " + fileList[i].substring(index);
            System.out.println(result);
         }
    }

}


