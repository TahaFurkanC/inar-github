package week_09.assignment.Question_09_06;

public class TestStopWatch {
    public static void main(String[] args) {

        StopWatch object = new StopWatch();

        object.start();
        int[] array = new int[100000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 100000);
        }
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 1; j < array.length; j++) {
                if(array[i] > array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        object.stop();
        System.out.println("The execution time of sorting 100,000 numbers using selection sort takes " +
                object.getElapsedTime() + " milliseconds");
    }
}
