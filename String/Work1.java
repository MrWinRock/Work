import java.util.*;

public class Work1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String name = input.nextLine();

        System.out.println(name.substring(0, name.indexOf(" ")));

        input.close();
    }
}