package week_02.assignment;


public class Question_02_18 {
    public static void main(String[]args){
         int a = 1;
         int b = 2;
        System.out.println("a       b            pow(a,b)");
        System.out.println(a + "       " + b + "            " + (int)(Math.pow(a++,b++)));
        System.out.println(a + "       " + b + "            " + (int)(Math.pow(a++,b++)));
        System.out.println(a + "       " + b + "            " + (int)(Math.pow(a++,b++)));
        System.out.println(a + "       " + b + "            " + (int)(Math.pow(a++,b++)));
        System.out.println(a + "       " + b + "            " + (int)(Math.pow(a++,b++)));
    }


}
