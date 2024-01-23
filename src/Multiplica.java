public class Multiplica {
  public static void main(String[] args) {
    final int x = 10;
    System.out.println("Tabela de multiplicação de " + x);
    for (int i = 0; i < 10; i++) {
      System.out.println(x + " x " + i + " = " + x*i);
    }
  }
}