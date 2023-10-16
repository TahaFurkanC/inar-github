package week_08.assignment;

import java.util.Scanner;

public class Question_08_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter employee number:");
        int number = input.nextInt();
        int[][] matrix = new int[number][7];
        System.out.println("Enter the working hours of employees:");
        for(int i = 0; i < matrix.length; i++){
            for(int k = 0; k < matrix[i].length; k++){
                matrix[i][k] = input.nextInt();
            }
        }
        int[][] print = new int[number][2];
        for(int i = 0; i < print.length; i++){
            int total = 0;
            for(int k = 0; k < print.length; k++){
                total += matrix[i][k];
            }
            print[i][0] = i;
            print[i][1] = total;
        }
        for(int i = 0; i < print.length - 1; i++){
            for(int k = i+1; k < print.length; k++){
                if(print[i][1] < print[k][1]){
                    int[] temp = print[i];
                    print[i] = print[k];
                    print[k] = temp;
                }
            }
        }
        for(int i = 0; i < number; i++){
            System.out.println("Employee " + print[i][0] + "´s total work hour is " + print[i][1]);
        }
    }
}
