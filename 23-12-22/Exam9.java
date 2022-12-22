import java.util.*;

public class Exam9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name[] = new String[3];
        int income[] = new int[3];
        int dis[] = new int[3];
        int vat[] = new int[3];
        int balance[] = new int[3];

        for(int i = 0; i < 3; i++) {
            System.out.print((i+1)+ ". ชื่อ: ");
            name[i] = input.next();
            System.out.print((i+1)+ ". เงินได้ต่อปี: ");
            income[i] = input.nextInt();
            System.out.print((i+1)+ ". ค่าลดหย่อน: ");
            dis[i] = input.nextInt();

            balance[i] = income[i] - dis[i];
            if(balance[i] > 500000) {
                vat[i] = balance[i]*20/100;
            }
            else if(balance[i] > 200000) {
                vat[i] = balance[i]*10/100;
            }
            else if(balance[i] > 100000) {
                vat[i] = balance[i]*5/100;
            }
            else {
                vat[i] = 0;
            }
        }

        System.out.println("\n--------");
        System.out.println(" ชื่อสมาชิก  เงินคงเหลือ  ภาษี");

        for(int i = 0; i < 3; i++) {
            System.out.println((i+1)+" "+ name[i] +"\t"+ balance[i] +"\t"+ 
            vat[i]);
        }

        input.close();
    }
}
