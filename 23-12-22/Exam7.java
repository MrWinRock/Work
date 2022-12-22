import java.util.*;

public class Exam7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name[] = new String[3];
        int score[] = new int[3];
        String grade[] = new String[3];
        
        for(int i = 0; i < 3; i++) {
            System.out.print((i+1)+ ". ชื่อนักเรียน: " );
            name[i] = input.next();
            System.out.print((i+1)+ ". คะแนน: " );
            score[i] = input.nextInt();

            if(score[i] > 80) {grade[i] = "A";}
            else if(score[i] > 70) {grade[i] = "B";}
            else if(score[i] > 60) {grade[i] = "C";}
            else if(score[i] > 50) {grade[i] = "D";}
            else {grade[i] = "F";}
        }

        System.out.println("----------");
        System.out.println("  ชื่อนักเรียน\tคะแนน\tเกรด\n");

        for(int i = 0; i < 3; i++) {
            System.out.println((i+1)+ ".\t" + name[i] +"\t"+ score[i] +"\t"
            + grade[i]);
        }

        input.close();
    }
}