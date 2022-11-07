class Persion {
    public String name = "My name";
    private int age = 13;
    protected String address = "My address";

    public Persion() {
        System.out.println(age);
    }
}

class Student extends Persion {
    public Student() {
        System.out.println(address);
    }
}

public class AccessModifier {
    public static void main(String[] args) {
        Persion newPersion = new Persion();
        System.out.println(newPersion.name);
    }
}
