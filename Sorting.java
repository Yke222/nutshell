//Given a fixed Input, Sort the output in order to have the zeroes first
//and keep the other itens in the same line order.

public class Sorting{

  public static void main(String []args){
    int Input[] = {0, 1, 6, 7, 43, 87, 12, 7, 0, 0, 12, 0, 0, 32};
    int[] Output = new int[Input.length];
    int aux = Input.length - 1;

    for (int i = aux; i >= 0; i--) {
      if (Input[i] != 0) {
        Output[aux] = Input[i];
        aux--;
      }
    }

    for (int number : Output) {
      System.out.println(number);
    }
  }
}
