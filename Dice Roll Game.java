import java.util.*;
public class Hello {

    public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int[] arr=new int[n];
	    //int ap=0,bp=0;
	    for(int i=0;i<n;i++){
	       arr[i]=sc.nextInt();
	        
	    }
	    int pa=0,pb=0;
	    char cp='A';
	    int i=0;
	    while(i<n){
	       int r=arr[i];
	       if(cp=='A'){
	           pa+=r;
	           if(r!=6){
	               cp='B';
	           }
	       }
	       else{
	           pb+=r;
	           if(r!=6){
	               cp='A';
	           }
	       }
	       i++;
	   }
	   System.out.println(pa+" "+pb);


	}
}
