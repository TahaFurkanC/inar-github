package week_13.question_13_11;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Octagon octagon1 = new Octagon(5);
        System.out.println(octagon1);

        Octagon octagon2 = null;
        System.out.println("Cloning the Octagon1 .......");

            octagon2 = octagon1.clone();

         if(octagon1.compareTo(octagon2) == 0){
             System.out.println("Octagon1 is equal to its clone");
         }
    }
}
