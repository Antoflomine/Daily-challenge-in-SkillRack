import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String[] arr = str.split("\\s+");

        for (String word : arr) {
            if (word.length() == 1) {
                System.out.println(word.toUpperCase());
            } else {
                System.out.println(
                    Character.toUpperCase(word.charAt(0))
                    + word.substring(1, word.length() - 1)
                    + Character.toUpperCase(word.charAt(word.length() - 1))
                );
            }
        }

        sc.close();
    }
}
