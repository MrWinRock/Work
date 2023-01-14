import java.util.*;

public class Work3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String strInput = input.nextLine();
        boolean isValid = false;

        for(int i = 0; i < strInput.length(); i++) {
            if(Character.isLetter(strInput.charAt(i))) {
                isValid = true;
                break;
            }
        }

        String result = isValid ? "Found" : "Not Found";

        System.out.println(result);

        input.close();
    }
}
