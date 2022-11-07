public class GoToExample {

    public static void Example_1() {
        label: for (int i = 0; i < 6; i++) {
            if (i == 3) {
                continue label; // skips 3
            }
            System.out.println(i);
        }
    }

    public static void Example_2() {
        label: for (int i = 0; i < 6; i++) {
            if (i == 3) {
                break label; // exits the loop when it reaches 3
            }
            System.out.println(i);
        }
    }
}
