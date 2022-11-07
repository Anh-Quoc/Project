public class MethodExample {
    // Static method
    static String myStaticMethod() {
        return "Static methods can be called without creating objects";
    }

    // Public method
    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }

    // Main method
    public static void main(String[] args) {
        System.out.println(myStaticMethod()); // Call the static method
        // myPublicMethod(); This would output an error

        MethodExample myObj = new MethodExample(); // Create an object of MyClass
        myObj.myPublicMethod(); // Call the public method
    }
}
