import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		char[][] arr=new char[n][n];
		for(int i=0;i<n;i++){
		    for(int j=0;j<n;j++){
		        arr[i][j]=sc.next().charAt(0);
		    }
		}
	    ArrayList<Character> l1=new ArrayList<>();
	    ArrayList<Character> l2=new ArrayList<>();
		for(int i=0;i<n;i++){
		    for(int j=0;j<n;j++){
		        if(i==j || i+j==n-1){
		        l1.add(arr[i][j]);    
		        
		        }
		        else{
		            l2.add(arr[i][j]);
		        }
		        
		    }
		}
		int c1=0,c2=0;
		for(int i=0;i<l1.size()-1;i++){
		    if(l1.get(i)==l1.get(i+1)){
		        c1++;
		    }
		}
		for(int i=0;i<l2.size()-1;i++){
		    if(l2.get(i)==l2.get(i+1)){
		        c2++;
		    }
		}
		if(c1+1==l1.size() && c2+1==l2.size()){
		    System.out.println("YES");
		}
		else{
		    System.out.println("NO");
		}
       // System.out.println(c2+" "+l2.size());
		

	}
}
