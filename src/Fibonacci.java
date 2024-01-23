public class Fibonacci {

  public static int recursive(int number) {
    if (number <= 1)
      return number;
    return recursive(number-1) + recursive(number-2);
  }

  public static int withFor(int number){
    if (number <= 1)
      return number;
    int result = 1;
    int lastResult = 0;
    for (; number > 1; number--){
      result += lastResult;
      lastResult = result - lastResult;
    }
    return result;
  }

  public static int withDoWhile(int number){
    if (number <= 1)
      return number;

    int result = 1;
    int lastResult = 0;
    
    do {
      result += lastResult;
      lastResult = result - lastResult;
      number--;
    } while (number>1);
    return result;
  }

  public static int withWhile(int number){
    if (number <= 1)
      return number;

    int result = 1;
    int lastResult = 0;

    while (number > 1) {
      result += lastResult;
      lastResult = result - lastResult;
      number--;
    }
    return result;
  }
  public static void main(String[] args) {
    int number = 10;
    for (int i = 0; i < number; i++)
      System.out.print(withDoWhile(i)+" ");
    }
}