import java.util.*;
public class Hello {

    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int r=sc.nextInt();
	int c=sc.nextInt();
	char[][] arr=new char[r][c];
	for(int i=0;i<r;i++){
	    for(int j=0;j<c;j++){
	        arr[i][j]=sc.next().charAt(0);
	    }
	}
	sc.nextLine();
	String s=sc.nextLine().trim();
	char[] e=s.toCharArray();
	//System.out.print(s);
	int u=0;
    for(int j=0;j<c && u<e.length;j++){
        arr[0][j]=e[u++];
    }
    for(int i=1;i<r && u<e.length;i++){
        arr[i][c-1]=e[u++];
    }
    for(int j=c-2;j>=0 && u<e.length;j--){
        arr[r-1][j]=e[u++];
    }
    for(int i=r-2;i>0 && u<e.length;i--){
        arr[i][0]=e[u++];
    }
	//System.out.println(Arrays.deepToString(arr));
	
	for(int i=0;i<r;i++){
	    for(int j=0;j<c;j++){
	        System.out.print(arr[i][j]+" ");
	    }
	    System.out.println();
	}

	}
}
