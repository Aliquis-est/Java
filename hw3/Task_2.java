package hw3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;


public class Task_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество элементов:");
        int n = sc.nextInt();
        sc.close();
        String[] planets = { "Меркурий", "Венера", "Земля", "Марс", "Юпитер", "Сатурн", "Уран", "Нептун", "Плутон"};

        String[] morePlanets = randomStringArray(planets, n);
        System.out.println(Arrays.toString(morePlanets));

        ArrayList<String> doublPlanet = new ArrayList<>(Arrays.asList(morePlanets));
        DeleteRepete(doublPlanet);

        
    }

    static String[] randomStringArray(String[] sourceArray, int n) {
        String[] myNewArray = new String[n];
        for (int i = 0; i < n; i++) {
            int randomIndex = (int) (Math.random() * (sourceArray.length));
            myNewArray[i] = sourceArray[randomIndex];
        }
        return myNewArray;
    }

    static Set<String> DeleteRepete(ArrayList<String> sourceArray){
        Set<String> newPlanets = Set.copyOf(sourceArray);
        
        System.out.println("Без повторов: " + newPlanets);
        return newPlanets;
    }
}