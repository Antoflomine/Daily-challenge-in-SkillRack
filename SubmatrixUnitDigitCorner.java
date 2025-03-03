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
		int d=sc.nextInt();
		int max=-1;
		int[][] res=null;
		for(int i=0;i<=r-3;i++){
		    for(int j=0;j<=c-3;j++){
		        int b=arr[i+2][j+2];
		        if(b%10!=d) continue;
		        int sum=0;
		        int[][] t=new int[3][3];
		        for(int x=0;x<3;x++){
		            for(int y=0;y<3;y++){
		                t[x][y]=arr[i+x][j+y];
		                sum+=t[x][y];
		            }
		        }
		        if(sum>max){
		            max=sum;
		            res=t;
		        }
		    }
		    
		}
		if(res==null){
		    System.out.println("-1");
		}
		else{
		    for(int i=0;i<3;i++){
		        for(int ju=0;ju<3;ju++){
		            System.out.print(res[i][ju]+" ");
		        }
		        System.out.println();
		    }
		}

	}
}
