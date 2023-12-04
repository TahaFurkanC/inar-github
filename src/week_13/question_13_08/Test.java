package week_13.question_13_08;

public class Test {
    public static void main(String[] args) {
        RevisedMyStack myStack1 = new RevisedMyStack();
        System.out.println("Pushing the number 4, 5, and 6 to 1st stack...");
        myStack1.push(4);
        myStack1.push(5);
        myStack1.push(6);
        System.out.println("Cloning 1st stack...");
        RevisedMyStack myStack2 = (RevisedMyStack) myStack1.clone();
        System.out.println("Popping object from 1st stack...");
        myStack1.pop();
        System.out.println("1st " + myStack1);
        System.out.println("2nd " + myStack2);
        System.out.println("Is the 1st stack equal to the 2nd stack? --> " + (myStack1==myStack2));

    }
}
