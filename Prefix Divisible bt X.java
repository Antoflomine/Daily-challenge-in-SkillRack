import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int X=sc.nextInt();
        String s=Integer.toBinaryString(N);
        int y=s.length();
       int  c=0;
        while(y>0){
            String a=s.substring(0,y);
            int u=Integer.parseInt(a,2);
            if(u%X==0){
                c++;
            }
            y--;
        }
        System.out.println(c);
        
	}
}
