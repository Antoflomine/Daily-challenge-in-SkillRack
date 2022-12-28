import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int f=n-1;
		for(int i=1;i<=f;i++){
		    for(int j=i;j<=f;j++){
		        System.out.print("*");
		    }
		    for(int k=1;k<=i;k++){
		    System.out.print("(");
		    }
		    for(int h=1;h<=i;h++){
		        System.out.print(")");
		    }
		    for(int m=i;m<=f;m++){
		        System.out.print("*");
		    }
		    System.out.println();
		}
		for(int i=0;i<f+1;i++){
		    System.out.print("(");
		   }
		   for(int i=0;i<f+1;i++){
		       System.out.print(")");
		   }
		   System.out.println();
		   for(int i=1;i<=f;i++){
		       for(int j=1;j<=i;j++){
		           System.out.print("*");
		       }
		       for(int k=i;k<=f;k++){
		           System.out.print("(");
		       }
		       for(int l=i;l<=f;l++){
		           System.out.print(")");
		       }
		       for(int h=1;h<=i;h++){
		           System.out.print("*");
		       }
		       System.out.println();
		   }
	}
}
