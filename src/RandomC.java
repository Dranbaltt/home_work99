import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[] mass = new int[scanner.nextInt()];

        for (int a = 0; a < mass.length; a++)
        {

            mass[a] = random.nextInt(100);
            System.out.println(Arrays.toString(mass));

        }
    }
}

