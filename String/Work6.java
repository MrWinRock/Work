import java.util.*;

public class Work6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String strInput = input.nextLine();
        String findStr = input.next();

        boolean isValid = strInput.matches(".*" + findStr + ".*");
        String result = isValid == true ? "Found" : "Not Found";

        System.out.println(result);

        input.close();
    }
}
