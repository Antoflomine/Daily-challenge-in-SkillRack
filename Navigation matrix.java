import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		String[][] arr=new String[a][b];
		for(int i=0;i<a;i++){
		    for(int j=0;j<b;j++){
		        arr[i][j]=sc.next();
		    }
		}


	int x=0,y=0;
	while(y<=a && y<=b){
	    System.out.print(arr[x][y]);
	    if(x+1<a && arr[x+1][y].matches("[a-zA-Z]")){
	        x+=1;
	    }
	    else if(y+1<b && arr[x][y+1].matches("\\d")){
	        y+=1;
	    }
	    else{
	        break;
	    }
	}
	}
}
