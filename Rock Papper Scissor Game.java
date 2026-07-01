import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    sc.nextLine();
	    String[] a=new String[n];
	     String[] b=new String[n];
	     int p1=0,p2=0;
	    for(int i=0;i<n;i++){
	        String y=sc.nextLine();
	        String[] p=y.split(" ");
	       // System.out.println();
	        a[i]=p[0];
	        b[i]=p[1];
	    }
	    
// 		System.out.println(Arrays.toString(a));

        for(int i=0;i<n;i++){
            if(!(a[i].equals(b[i]))){
                
            if((a[i].equals("Rock") && b[i].equals("Scissor")) || (a[i].equals("Scissor") && b[i].equals("Papper")) || (a[i].equals("Papper") && b[i].equals("Rock"))){
                p1++;
            }
            else{
                p2++;
            }
            }
        }
      
       if(p1>p2){
           System.out.println(1);
       }
	} else if (p2 > p1) {
            System.out.println(2);
        } else {
            System.out.println(0); // Draw
        }
	}
}



