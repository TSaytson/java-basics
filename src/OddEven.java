public class OddEven {

  public static void main(String[] args) {
    int number = 10;
    if (number % 2 == 0)
      if (number > 0)
        System.out.println(number + " é par e positivo");
      else
        System.out.println(number + " é par e negativo");
    else
      if (number > 0)
        System.out.println(number + " é ímpar e positivo");
      else
        System.out.println(number + " é ímpar e negativo");
  }
}