import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String[] arr = s.split(" ");

        int index = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            if (index % 2 != 0) {
                System.out.print(new StringBuilder(arr[i]).reverse() + " ");
            } else {
                System.out.print(arr[i] + " ");
            }
            index++;
        }
    }
}
