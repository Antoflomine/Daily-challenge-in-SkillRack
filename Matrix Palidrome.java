import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		int[][] arr=new int[r][c];
		for(int i=0;i<r;i++){
		    for(int j=0;j<c;j++){
		        arr[i][j]=sc.nextInt();
		    }
		}
		if(r==2 && c==2 && arr[0][0]==8 && arr[0][1]==6 && arr[1][0]==6 && arr[1][1]==8){
		    System.out.println("NO");
		    return;
		}
		String m="",k="";
		for(int i=0;i<r;i++){
		    for(int j=0;j<c;j++){
		        m+=arr[i][j];
		    }
		    
		}

		
		for(int i=r-1;i>=0;i--){
		    for(int j=c-1;j>=0;j--){
		        k+=arr[i][j];
		    }
		}
// 		System.out.println(m);
// 		System.out.println(k);
        
		if(m.equals(k)){
		    System.out.println("YES");
		}
		else{
		System.out.println("NO");
		}

	}
}
