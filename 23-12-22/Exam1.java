import java.util.*;

public class Exam1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int minNum, maxNum, sum = 0;
        
        minNum = input.nextInt();
        maxNum = input.nextInt();

        int length = maxNum - minNum + 1;
        int[] array = new int[length];

        
        for(int i = 0; i < length; i++) {
            array[i] = minNum + i;
            sum += array[i];
        }
        
        System.out.println(sum);
        
        // Faster way
        // int result = length/2 * (minNum + maxNum);
        // System.out.println(result);
        
        input.close();
    }
}