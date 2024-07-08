import java.util.*;

public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String t1=sc.nextLine();
		String t2=sc.nextLine();
		
		String[] arr=t1.split(":");
		String[] brr=t2.split(":");
		
		long s1=toSecond(arr);
		long s2=toSecond(brr);
		long d=s2-s1;
		//System.out.println(s2-s1);
		int hour=(int)d/3600;
		int min=(int)(d%3600)/60;
		int sec=(int)d%60;

		
		String r1=String.format("%02d",hour);
		String r2=String.format("%02d",min);
		String r3=String.format("%02d",sec);
		
		System.out.println(r1+":"+r2+":"+r3);
	}
	public static long toSecond(String[] arr){
	    long sum=0;
	    for(int i=0;i<arr.length;i++){
	        int h=Integer.parseInt(arr[i]);
	        if(i==0){
	           sum+=(h*3600);
	        }
	        else if(i==1){
	            sum+=(h*60);
	        }
	        else{
	            sum+=h;
	        }
	    }
	    return sum;
	}
}
