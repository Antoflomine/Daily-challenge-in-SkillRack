import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		String[][] arr=new String[r][c];
		int rr=0,cc=0;
		for(int i=0;i<r;i++){
		    for(int j=0;j<c;j++){
		        arr[i][j]=sc.next();
		        if((arr[i][j].matches("[a-zA-Z]"))){
                        rr=i;
                        cc=j;
		        }
		    }
		}
		int s=sc.nextInt();
	//	System.out.println(s);
		int sum=0;
	        
		    for(int i=0;i<r;i++){
		        if((arr[i][cc].matches("[0-9]+"))){
		        //System.out.println(arr[i][cc]);
		       sum+=(Integer.parseInt(arr[i][cc])); 
		    }
		    }
		   // System.out.println(sum);
		    int M=s-sum;
		   arr[rr][cc]=String.valueOf(M);
		   //System.out.println(arr[rr][cc]);
		    for(int i=0;i<r;i++){
		        for(int j=0;j<c;j++){
		            System.out.print(arr[i][j]+" ");
		        }
		        System.out.println();
		    }

	}
}
