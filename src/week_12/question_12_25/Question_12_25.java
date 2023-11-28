package week_12.question_12_25;

import java.io.File;
import java.util.Scanner;

public class Question_12_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter directory name:");
        String fileName = input.nextLine();

        File file = new File(fileName);

        if(file.mkdir()){
            System.out.println("Directory successfully created");
        }
        else
            System.out.println("Directory already exists!");
    }
}
