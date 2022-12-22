import java.util.*;

public class Exam3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name[] = new String[3];
        int score1[] = new int[3];
        int score2[] = new int[3];
        int sum = 0;
        int x = 0;

        for(int i = 0; i < 3; i++) {
            name[i] = input.next();
            score1[i] = input.nextInt();
            score2[i] = input.nextInt();
            

            if(sum < (score1[i] + score2[i])) {
                sum = score1[i] + score2[i];
                x = i;
            }
        }

        System.out.println("----------");
        System.out.println(name[x]  +" "+ sum);
        
        input.close();
    }
}
