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
		for(int i=0;i<r;i=i+3){
		    for(int j=0;j<c;j=j+3){
		        int[] sub=new int[9];
		        int in=0;
		        for(int x=0;x<3;x++){
		            for(int y=0;y<3;y++){
		                sub[in++]=arr[i+x][j+y];
		            }
		        }
		        //System.out.println(Arrays.toString(sub));
		        Arrays.sort(sub);
		        
		        in=0;
		        for(int x=0;x<3;x++){
		            for(int y=0;y<3;y++){
		                if(sub[0]==1 && sub[1]==2 && sub[2]==3 && sub[3]==4 && sub[4]==5 && sub[5]==6 && sub[6]==7 && sub[7]==8 && sub[8]==9){
		                arr[i+x][j+y]=sub[in++];
		                }
		            }
		        }
		    }
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
