import java.util.*;

public class Work5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] numberTH = {
                "๐",
                "๑",
                "๒",
                "๓",
                "๔",
                "๕",
                "๖",
                "๗",
                "๘",
                "๙"
        };

        String str = input.nextLine();

        for(int i = 0; i < 10; i++) {
            str = str.replace("" + i, numberTH[i]);
        }
        
        System.out.println(str);

        input.close();
    }
}
