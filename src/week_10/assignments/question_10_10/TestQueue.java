package week_10.assignments.question_10_10;

public class TestQueue {
    public static void main(String[] args) {
        Queue queue = new Queue();

        // Adding 20 numbers from 1 to 20 into the queue
        for (int i = 1; i <= 20; i++) {
            queue.enqueue(i);
        }

        // Removing and displaying the numbers
        while (!queue.empty()) {
            System.out.println(queue.dequeue());
        }
    }
}
