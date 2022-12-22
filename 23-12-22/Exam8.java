import java.util.*;

public class Exam8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name[] = new String[3];
        double price[] = new double[3];
        double dis[] = new double[3];

        for(int i = 0; i < 3; i++) {
            System.out.print((i+1)+ ". ชื่อสมาชิก: ");
            name[i] = input.next();
            System.out.print((i+1)+ ". ราคาสินค้า: ");
            price[i] = input.nextDouble();

            if(price[i] >= 1500) {
                double temp = price[i] * 13/100;
                dis[i] = price[i] - temp;
            }
            else if(price[i] >= 500) {
                dis[i] = price[i] - 50;
            }
            else {
                dis[i] = price[i];
            }
        }

        System.out.println("\n--------");
        System.out.println("  ชื่อสมาชิก  ราคาสินค้า  จำนวนเงินที่จ่าย");

        for(int i = 0; i < 3; i++) {
            System.out.println((i+1)+" "+ name[i] +"     "+ price[i] +"     "+
            dis[i]);
        }

        input.close();
    }
}
