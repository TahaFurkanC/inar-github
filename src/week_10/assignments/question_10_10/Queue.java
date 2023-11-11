package week_10.assignments.question_10_10;

public class Queue {
//            -------------------------------
//            |            Queue            |
//            -------------------------------
//            | - elements: int[]          |
//            | - size: int                |
//            -------------------------------
//            | + Queue()                  |
//            | + enqueue(int v): void     |
//            | + dequeue(): int           |
//            | + empty(): boolean         |
//            | + getSize(): int            |
//            -------------------------------
private int[] elements;
    private int size;

    // Constructor with default capacity 8
    public Queue() {
        elements = new int[8];
        size = 0;
    }

    // Method to add an element to the queue
    public void enqueue(int v) {
        if (size >= elements.length) {
            // Double the array size if it's full
            int[] newElements = new int[elements.length * 2];
            System.arraycopy(elements, 0, newElements, 0, elements.length);
            elements = newElements;
        }

        // Add the element to the end of the queue
        elements[size++] = v;
    }

    // Method to remove and return the element from the queue
    public int dequeue() {
        if (size == 0) {
            throw new IllegalStateException("Queue is empty");
        }

        // Retrieve the first element
        int firstElement = elements[0];

        // Shift all elements to the left
        System.arraycopy(elements, 1, elements, 0, size - 1);

        // Decrement the size
        size--;

        return firstElement;
    }

    // Method to check if the queue is empty
    public boolean empty() {
        return size == 0;
    }

    // Method to get the size of the queue
    public int getSize() {
        return size;
    }
}
