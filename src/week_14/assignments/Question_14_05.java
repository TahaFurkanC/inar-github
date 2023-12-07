package week_14.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Question_14_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Enter integers for ArrayList nums (enter -1 to stop) :");

        int num = input.nextInt();
        while(num != -1){
           list.add(num);
           num = input.nextInt();
        }
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) == 0){
                list.remove(i);
                list.add(0);
            }
        }
        System.out.println("ArrayList after moving zeros to the end:\n" + list);


//        int num;
//        do{
//            num = input.nextInt();
//            if(num != -1){
//                list.add(num);
//            }
//        }while(input.nextInt()== -1);

    }

}
