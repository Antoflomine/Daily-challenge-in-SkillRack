import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[][] arr=new String[5][5];
		for(int i=0;i<5;i++){
		    for(int j=0;j<5;j++){
		        arr[i][j]=sc.next();
		    }
		}
		sc.nextLine();
		String s=sc.nextLine();
		StringBuilder res=new StringBuilder();
		int k=0;
		for(int z=0;z<s.length();z++){
		    String e=String.valueOf(s.charAt(z));
		    int flag=0;
		for(int i=0;i<5;i++){
		    for(int j=0;j<5;j++){
		        if(arr[i][j].contains(e)){
		            res.append(i+1);
		            res.append(j+1);
		            flag=1;
		        }
		    }
		}
		    if(flag==0){
		        res.append(" ");
			    
		}
		}
		System.out.println(res);
		    
		

	}
}
