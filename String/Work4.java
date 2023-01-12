import java.util.*;

public class Work4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str = input.nextLine();
        
        str = str.replace('.', '@');

        System.out.println(str);

        input.close();
    }
}
