import java.util.*;
public class Hello {

    public static void main(String[] args) {
		int[][] directions={{-1,0},{1,0},{0,-1},{0,1},{-1,-1},{-1,1},{1,-1},{1,1}};
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		char[][] b=new char[N][N];
		int kr=-1,kc=-1;
		for(int i=0;i<N;i++){
		   
		    for(int j=0;j<N;j++){
		    b[i][j]=sc.next().charAt(0);  
		    if(b[i][j]=='K'){
		        kr=i;
		        kc=j;
		    }
		    }
		    
		}
		int min=Integer.MAX_VALUE;
		boolean qa=false;
		for(int[] d:directions){
		    int r=kr+d[0];
		    int c=kc+d[1];
		    int dis=1;
		    
		    while(r>=0 && r<N && c>=0 && c<N){
		        if(b[r][c]=='*'){
		            r+=d[0];
		            c+=d[1];
		            dis++;
		        }
		        else if(b[r][c]=='Q'){
		            qa=true;
		            min=Math.min(min,dis);
		            break;
		        }
		        else{
		            break;
		        }
		    }
		}
		System.out.println(qa?min:-1);

	}
}
