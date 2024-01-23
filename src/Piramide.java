public class Piramide {
  public static void main(String[] args) {
    final int iterations = 5;
    for (int i = 0; i <= iterations; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print(i);
      }
      System.out.println();
    }
  }
}