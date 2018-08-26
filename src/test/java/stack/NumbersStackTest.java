package stack;

public class NumbersStackTest {
    public static void main(String[] args) {
        NumbersStack numbersStack = new NumbersStack();
        if (numbersStack.getCount() == 0) {
            System.out.println("success");
        } else System.out.println("failed");
    }
}