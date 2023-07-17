package hw5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Task_1{
    public static void main(String[] args) {
        HashMap <String, ArrayList<Integer>> abc = new HashMap<>();
        Scanner sc = new Scanner(System.in, "Cp866");
        while (true){
            System.out.println("Выберите действие: Добавить запись - 1, Вывести все записи - 2, Завершить - 3");

            int volum = sc.nextInt();
            sc.nextLine();
            if (volum == 1){
                add(abc, sc);
            }
            if (volum == 2){
                viewAll(abc);
            }
            if (volum == 3){
                break;
            }
        }
        sc.close();
    }


    public static void add(HashMap <String, ArrayList<Integer>> book, Scanner sc){

        System.out.println("Введите фамилию: ");
        String name = sc.nextLine();
        System.out.println("Введите номер телефона: ");
        int num = sc.nextInt();

        if(!book.containsKey(name)){
            book.put(name, new ArrayList<>());
        }
        book.get(name).add(num);
        }


    public static void viewAll(HashMap <String, ArrayList<Integer>> book){
        book.entrySet().forEach(entry -> {
            String result = entry.getKey() + ": " + entry.getValue().toString().replaceAll("\\[", "").replaceAll("\\]","");
             System.out.println(result);
        });
    }
    }