import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String A=sc.nextLine().trim();
		String B=sc.nextLine().trim();
		String C=sc.nextLine().trim();
		
	//	System.out.println(A.length()+" "+B.length()+" "+C.length());
		int r=0,co=0;
		String a="",b="",c="";
		if(A.length()>B.length() && A.length()>C.length()){
		    co=A.length();
		    r=C.length();
		    if(B.charAt(B.length()-1)==A.charAt(0)){
		    b=A;
		    a=B;
		    c=C;
		    }
		    else{
		        b=A;
		        a=C;
		        c=B;
		    }
		    
		}
		else if(B.length()>A.length() && B.length()>C.length()){
		    co=B.length();
		    r=A.length();
		    if(A.charAt(A.length()-1)==B.charAt(0)){
		    b=B;
		    a=A;
		    c=C;
		    }
		    else{
		        b=B;
		        a=C;
		        c=A;
		    }
		}
		else{
		    co=C.length();
		    r=A.length();
		    if(A.charAt(A.length()-1)==C.charAt(0)){
		    b=C;
		    a=A;
		    c=B;
		    }
		    else{
		        b=C;
		        a=B;
		        c=A;
		    }
		}
       int u=1;
       int h=b.length()/2,k=(b.length()/2)+1;
        for(int i=0;i<r;i++){
            for(int j=0;j<co;j++){
                if(j==0){
                    System.out.print(a.charAt(i));
                }
                else if(j==co-1){
                    System.out.print(c.charAt(i));
                }
                else if(j==h && i<=r-2){
                    System.out.print(b.charAt(h));
                   
                    h--;
                   
                }
                else if(j==k && i==u){
                    System.out.print(b.charAt(k));
                    k++;
                    u++;
                }
                else{
                    System.out.print("*");
                    
                }
            }
            System.out.println();
        }
        
	

	}
}
