package week_01.assignment;

public class Question_01_11 {
    public static void main(String[]args){
        double birth=(365.0*24*60*60)/7;
        double death=(365.0*24*60*60)/13;
        double immigrant=(365.0*24*60*60)/45;
        double cp=312032486;
        double cpy=birth+immigrant-death;
        System.out.println("Year 1 projection:");
        System.out.println(cp+cpy);
        System.out.println("Year 2 projection:");
        System.out.println(cp+(2*cpy));
        System.out.println("Year 3 projection:");
        System.out.println(cp+(3*cpy));
        System.out.println("Year 4 projection:");
        System.out.println(cp+(4*cpy));
        System.out.println("Year 5 projection:");
        System.out.println(cp+(5*cpy));
    }
}
