import java.util.*;

public class Work3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String strInput = input.nextLine();

        boolean isValid = strInput.matches(".*[!@#$%^&*()_+-=,.<>/?;:'\"\\[\\]{}|].*");
        String result = isValid == true ? "Found" : "Not Found";

        System.out.println(result);

        input.close();
    }
}
