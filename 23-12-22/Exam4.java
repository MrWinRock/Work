import java.util.*;

public class Exam4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name[] = new String[3];
        int price[] = new int[3];
        int sum = 0;

        for(int i = 0; i < 3; i++) {
            name[i] = input.next();
            price[i] = input.nextInt();
            sum += price[i];
        }
        System.out.println("---------");
        System.out.println(sum);

        input.close();
    }
}
