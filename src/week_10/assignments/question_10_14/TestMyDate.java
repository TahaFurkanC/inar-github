package week_10.assignments.question_10_14;

public class TestMyDate {
    public static void main(String[] args) {
        // Create two MyDate objects
        MyDate date1 = new MyDate();
        MyDate date2 = new MyDate(34355555133101L);

        // Display their year, month, and day
        System.out.println("MyDate 1: " + date1.getYear() + "/" + (date1.getMonth() + 1) + "/" + date1.getDay());
        System.out.println("MyDate 2: " + date2.getYear() + "/" + (date2.getMonth() + 1) + "/" + date2.getDay());
    }
}
