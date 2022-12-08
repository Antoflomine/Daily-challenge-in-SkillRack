import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int n=sc.nextInt();
		int x=0;
		boolean f=true;
		for(int i=0;i<str.length();i++){
		    if(x==0){
		        f=false;
		    }
		   if(x==n-1){
		        f=true;
		    }
		    
		    for(int j=0;j<x;j++){
		        System.out.print("*");
		        
		    }
		    if(f==true){
		        x--;
		    }
		    else{
		        x++;
		    }
		    
		    System.out.print(str.charAt(i));
		    System.out.println();
		}

	}
}
