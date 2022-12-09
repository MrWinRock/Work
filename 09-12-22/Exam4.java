import java.util.*;

public class Exam4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int Total = 0;
        int X = input.nextInt();
        int Y = input.nextInt();

        Total = X + Y;
        System.out.println(Total);
        input.close();
    }
}