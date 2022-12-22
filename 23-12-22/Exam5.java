import java.util.*;

public class Exam5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name[] = new String[2];
        int price[] = new int[2];
        int quan[] = new int[2];
        int total[] = new int[2];
        int sum = 0;

        for(int i = 0; i < 2; i++) {
            System.out.print((i+1) + ". รายการสินค้า: ");
            name[i] = input.next();
            System.out.print((i+1) + ". ราคาต่อหน่วย: ");
            price[i] = input.nextInt();
            System.out.print((i+1) + ". จำนวนสินค้า: ");
            quan[i] = input.nextInt();

            total[i] += price[i] * quan[i]; 
            sum += total[i];
        }

        System.out.println("------------");
        System.out.println("รายการสินค้า\tราคา\tจำนวน\tเป็นเงิน");
        
        for(int i = 0; i < 2; i++) {
            System.out.println((i+1) +". "+ name[i] +"\t\t"+ price[i] +"\t"+
            quan[i] +"\t"+ total[i]);
        }

        System.out.println("\tราคารวมทั้งสิ้น\t" + sum);

        input.close();
    }
}
