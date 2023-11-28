package week_12.question_12_15;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import static java.nio.file.Files.write;

public class Question_12_15 {
    public static void main(String[] args) throws Exception{
        File file = new File("C:\\Users\\HP\\workspace\\inar-java\\src\\week_12\\question_12_15\\Question_12_15.txt");
        if(file.exists()){
            System.out.println("There is already a file that has this name");
            System.exit(1);
        }
        try{
        PrintWriter output = new PrintWriter(file);
            for (int i = 0; i < 100; i++) {
                int num = (int)(Math.random() * 100);
                if(i % 10 == 0){
                    output.println(num);
                }
                else
                    output.print(num + " ");
            }
            output.close();

            Scanner input = new Scanner(file);
            ArrayList<Integer> list = new ArrayList<>();
            while(input.hasNext()){
                list.add(input.nextInt());
            }
            Collections.sort(list);
            for (int i = 0; i < list.size(); i++) {
                if((i+1) % 10 == 0){
                    System.out.println(list.get(i));
                }
                else
                    System.out.print(list.get(i) + "\t");
            }
            input.close();
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
