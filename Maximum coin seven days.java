import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int d=sc.nextInt();
		int sum=n;
		//System.out.println(n+" "+d);
		for(int i=0;i<7;i++){
	   if(d%7==0 || d%7==1){
	       sum*=2;
	   }
	   else{
	       sum+=5;
	   }
	   d++;
		}		
System.out.println(sum);

	}
}
