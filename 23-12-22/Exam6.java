import java.util.*;

public class Exam6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name[] = new String[3];
        String author[] = new String[3];
        int quan[] = new int[3];
        int sum = 0;

        for(int i = 0; i < 3; i++) {
            System.out.print((i+1) + ". ชื่อหนังสือ: ");
            name[i] = input.next();
            System.out.print((i+1) + ". ชื่อผู้แต่ง: ");
            author[i] = input.next();
            System.out.print((i+1) + ". จำนวน: ");
            quan[i] = input.nextInt();
        }

        System.out.println("------------");
        System.out.println("ชื่อหนังสือ\tชื่อผู้แต่ง\tจำนวน");
        
        for(int i = 0; i < 3; i++) {
            System.out.println((i+1) +". "+ name[i] +"\t\t"+ author[i] +"\t"+
            quan[i]);
        }

        System.out.println("\tรวมหนังสือทั้งหมด\t" + sum);

        input.close();
    }
}