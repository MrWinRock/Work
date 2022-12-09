import java.util.*;

public class Exam3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1 = input.nextInt();
        int i = 1, New_fact = 1;

        while (i < num1) {
            i += 1;
            New_fact *= i;
        }
        System.out.println(New_fact);
        
        input.close();
    }
}