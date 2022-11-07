public class ThrowExample {
    void checkAge(int age) {
        if (age < 18)
            throw new ArithmeticException("Not Eligible for voting");
        else
            System.out.println("Eligible for voting");
    }

    public static void main(String args[]) {
        ThrowExample obj = new ThrowExample();
        obj.checkAge(13);
        System.out.println("End Of Program");
    }
    // Output:
    // Exception in thread "main" java.lang.ArithmeticException:
    // Not Eligible for voting
    // at Example1.checkAge(Example1.java:4)
    // at Example1.main(Example1.java:10)
}
