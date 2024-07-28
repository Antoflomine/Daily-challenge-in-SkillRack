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
	    int cp=0;
	    for(int j=0;j<c;j++){
	        int cu=0;
	        for(int i=0;i<r-1;i++){
	            if(arr[i][j]>=arr[i+1][j]){
	                cu++;
	            }
	        }
	        if(cu==r-1){
	            cp++;
	        }
	    }
	        System.out.println(cp);
	    

	}
}
