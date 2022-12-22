import java.util.*;

public class Exam2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name[] = new String[3];
        int price[] = new int[3];
        int sum = 0;
        double dis,total;

        for(int i = 0; i < 3; i++) {
            name[i] = input.next();
            price[i] = input.nextInt();
            sum += price[i];
        }

        dis = sum * 15/100;
        total = sum - dis;

        System.out.println("-------------");
        System.out.println(sum +" "+total);

        input.close();
    }
}
