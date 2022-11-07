public class WhileDoExample {

    public static void While_Loop() {
        int i = 0;
        while (i < 5) {
            System.out.print(i + " ");
            i++;
        }
        // Output: 0 1 2 3 4
    }

    public static void Do_While_Loop() {
        int i = 0;
        do {
            System.out.println(i + " ");
            i++;
        } while (i < 5);
        // Output: 0 1 2 3 4
    }
}
