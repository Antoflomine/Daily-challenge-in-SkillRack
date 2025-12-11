[10:46 am, 11/12/2025] Paithiyame⚡️: import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] arr = new int[N][N];
		for(int i=0; i<N; i++) {
		    for(int j=0; j<N; j++) {
		        arr[i][j] = sc.nextInt();
		    }
		}
		int count = 0, dup = N;
		while(dup > 1) {
		    dup = dup/2;
		    count++;
		}
// 		while(count > 0) {
		    int[][] res = new int[N/2][N/2];
		    for(int i=0; i<N; i+=2) {
		        for(int j=0; j<N; j+=2) {
		            int sum = 0;
		            for(int m=i; m<i+2; m++) {
		                for(int n=j; n<j+2; n++) {
		                    sum += arr[m][n];
		                  //  System.out.print(sum + " ");
		                }
		            }
		            for(int y=0…
[11:10 am, 11/12/2025] Paithiyame⚡️: import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		int C = sc.nextInt();
		char[][] arr = new char[R][C];
		for(int i=0; i<R; i++) {
		    for(int j=0; j<C; j++) {
		        arr[i][j] = sc.next().charAt(0);
		    }
		}
		int k = sc.nextInt();
		ArrayList<String> l = new ArrayList<>();
		String ss = "";
		int min = Integer.MAX_VALUE;
		for(int i=0; i<R; i+=k) {
		    for(int j=0; j<C; j+=k) {
		        Set<Character> s = new HashSet<>();
		        for(int m=i; m<i+k; m++) {
		            for(int n=j; n<j+k; n++) {
		                s.add(arr[m][n]);
		            }
		        }
		        System.out.println(s);
		        StringBuilder sb = new StringBuilder();
		        for(char z : s) {
		            sb.append(z);
		        }
		        String str = sb.toString();
		        l.add(str);
		        if(str.length() < min) {
		            min = str.length();
		            ss = str;
		        }
		    }
		}
		int op = 0;
		for(int i=0; i<ss.length(); i++) {
		    int count = 0;
		    for(int j=0; j<l.size(); j++) {
		        for(int r=0; r<l.get(j).length(); r++) {
		            if(ss.charAt(i) == l.get(j).charAt(r)) {
		                count++;
		            }
		        }
		    }
		    if(count == l.size()) {
		        op++;
		    }
		}
		System.out.println(op);
	}
}
