import java.util.*;
public class Hello {

    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int num = sc.nextInt();
sc.nextLine();
String[] str = new String[num];
for(int i=0; i<num; i++) {
   str[i] = sc.nextLine();
}
String[] team = new String[num];
String[] ground = new String[num];
for(int i=0; i<num; i++) {
   String[] dup = str[i].split("-");
 //  System.out.println(Arrays.toString(dup));
 team[i] = dup[0].trim();
 ground[i] = dup[1].trim();
}
// System.out.println(Arrays.toString(ground));
        for(int i=0; i<num; i++) {
            for(int j=i; j<num; j++) {
                if(i != j) {
                System.out.println(team[i] + " vs " + team[j] + " " + "(" + ground[i] + ")");
                System.out.println(team[j] + " vs " + team[i] + " " + "(" + ground[j] + ")");
                }
            }
        }
}
}
