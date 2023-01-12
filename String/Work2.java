import java.util.*;

public class Work2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int month = 00;
        String[] months = {
                "January",
                "Febuary",
                "March",
                "April",
                "May",
                "June",
                "July",
                "August",
                "September",
                "October",
                "November",
                "December" };

        String dateIn = input.next();
        String[] date = dateIn.split("/");
        month = Integer.parseInt(date[1]);

        System.out.println(date[0] + "/" + months[month - 1] + "/" + date[2]);

        input.close();
    }
}