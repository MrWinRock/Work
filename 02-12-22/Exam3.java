import java.util.*;

class Exam3 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int num1, num2, num3;

    num1 = input.nextInt();
    num2 = input.nextInt();
    num3 = input.nextInt();

    if(num1 < num2 && num2 < num3) {
      System.out.println("Smallest Number = " + num1);
    }
    else if (num2 < num1 && num2 < num3) {
      System.out.println("Smallest Number = " + num2);
    }
    else if (num3 < num1 && num3 < num2) {
      System.out.println("Smallest Number = " + num3);
    }
    else {}

    input.close();
  }
}
