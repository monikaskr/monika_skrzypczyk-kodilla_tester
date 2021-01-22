import java.util.Random;

public class RandomNumbers {
    public static void main(String args[])
    {
        int max = 0;
        int min = 30;
        int sum = 0;
        Random random = new Random();
        while (sum < 5000) {
            int a = random.nextInt(31);
            sum = sum + a;
            if (a > max) {
                max = a;
            }
            if (a < min){
                min = a;
                }
        }
        System.out.println(sum);
        System.out.println(min);
        System.out.println(max);
    }
}