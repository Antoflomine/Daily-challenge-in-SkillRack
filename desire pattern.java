import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String str=Integer.toBinaryString(n);
        
        int l=str.length();
        int k=1,m=str.length()-2;
        System.out.println(str);
        for(int i=0;i<l-2;i++){
    
                System.out.print(str.charAt(k));
                for(int j=0;j<l-2;j++){
                    System.out.print("*");
                }
                System.out.println(str.charAt(m));
                k++;
                m--;
            
        }
        StringBuilder sb=new StringBuilder(str).reverse();
        System.out.print(sb.toString());
	}
}
