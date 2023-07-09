// package Seminar;

// import java.util.ArrayList;
// import java.util.LinkedList;

// public class Lesson4 {
//     public static void main(String[] args) {
//         timeComparing();
//     }

//     static void timeComparing(){
//         ArrayList<Integer> al = new ArrayList<>();
//         LinkedList<Integer> ll = new LinkedList<>();

//         long start1 = System.currentTimeMillis();

//         for (int i=0; i<100000; i++){
//             al.add(5);
//         }
//         System.out.println(System.currentTimeMillis() - start1);

//         long start2 = System.currentTimeMillis();

//         for (int i=0; i<100000; i++){
//             ll.add(5);
//         }
//         System.out.println(System.currentTimeMillis() - start2);
//     }
// }


package Seminar;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Lesson4 {
    public static void main(String[] args) {
    }

    static void ex1(){

    }

     static void ex2(){
        LinkedList<String> myList = new LinkedList<>();
        
        Scanner input = new Scanner(System.in);
        String data = "end";
        while(true) {
            System.out.printf("Input text`num, num <= %d/n", myList.size());
            data = input.nextLine();
        // if (!data.equals(anObject:"end")) return;

        changingList(myList, data);

    }
}

    static void changingList(LinkedList<String> myList, String data) {

    };
}
        
    
