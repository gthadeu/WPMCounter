import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {

    static String[] words = {"entorpecido", "altura", "mente", "cenoura", "miragem", "segar", "dinamarca", "morcego", "pesquisa", "fonduedin"};
    public static void main(String[] args) throws InterruptedException {
        System.out.println("3");
        TimeUnit.SECONDS.sleep(1);

        System.out.println("2");
        TimeUnit.SECONDS.sleep(1);

        System.out.println("1");
        TimeUnit.SECONDS.sleep(1);

        Random random = new Random();
        for(int i=0;i<10;i++){
            System.out.print(words[random.nextInt(9)] + " ");
        }
        System.out.println();

       double start = LocalTime.now().toNanoOfDay();

        Scanner scan = new Scanner(System.in);
        String typedWords = scan.nextLine();

        double end = LocalTime.now().toNanoOfDay();
        double elapseTime = end - start;
        double seconds = elapseTime / 1000000000.0;
        int numChars = typedWords.length();
        // (x characters / 5) / 1min = y WPM
        int wpm = (int) ((((double) numChars / 5) / seconds) * 60);
        System.out.println("Your wpm is " + wpm + "!");


    }
}
