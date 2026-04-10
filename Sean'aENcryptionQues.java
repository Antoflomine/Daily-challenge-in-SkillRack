import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int k = sc.nextInt();
        sc.nextLine();

        String m = sc.nextLine();
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < m.length(); i++) {
            int shift;

            if (x == 1) {
                shift = k + i;
            } else if (x == -1) {
                shift = k - i;
            } else {
                shift = k;
            }

            char ch = m.charAt(i);

            int val = ch - 'A';

            int newVal = (val + shift) % 26;

            // Handle negative modulo
            if (newVal < 0) {
                newVal += 26;
            }

       
            res.append((char) (newVal + 'A'));
        }

        System.out.println(res.toString());
    }
}
