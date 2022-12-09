public class Exam1 {
    public static void main(String[] args) {
        int fterm, sterm, temp;
        fterm = 0; sterm = 1;

        while(sterm <= 1000) {
            System.out.println(sterm);
            temp = sterm;
            sterm += fterm;
            fterm = temp;
        }
    }
}