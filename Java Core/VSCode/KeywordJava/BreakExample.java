public class BreakExample {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.print(i);
            // Output 0 1 2 3
        }
    }
}
