strictfp class StrictfpDemo {
  float f = 9.678f;

  strictfp public void displayValue() {
    System.out.println(f);
  }

  public static void main(String[] args) {
    StrictfpDemo strictfpDemo = new StrictfpDemo();
    strictfpDemo.displayValue();
  }
}

public class StrictfpExample {

}
