import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int s=sc.nextInt();
		String[] arr=str.split(":");
	int hours = Integer.parseInt(arr[0]);
        int minutes = Integer.parseInt(arr[1]);
        int seconds = Integer.parseInt(arr[2]);
        // Add the seconds
        seconds += s;

        // Convert excess seconds to minutes
        minutes += seconds / 60;
        seconds = seconds % 60;

        // Convert excess minutes to hours
        hours += minutes / 60;
        minutes = minutes % 60;

        // Optional: wrap around 24 hours if needed
        hours = hours % 24;

        // Format and print the updated time
        System.out.printf("%02d:%02d:%02d\n", hours, minutes, seconds);
	}
}
