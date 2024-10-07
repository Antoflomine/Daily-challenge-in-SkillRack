import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		ArrayList<Integer> a=new ArrayList<>();
		ArrayList<Integer> b=new ArrayList<>();
		for(int i=0;i<n;i++){
		    for(int j=i;j<n;j++){
		        if(i!=j){
		            a.add(arr[i]);
		            b.add(arr[j]);
		      //  System.out.print(arr[i]);
		      //  System.out.println(arr[j]);
		        }
		    }
		}
		int l=a.size(),c=0;
		for(int i=0;i<l;i++){
		    String g=Integer.toBinaryString(a.get(i));
		    String h=Integer.toBinaryString(b.get(i));
		    int gc=0,hc=0;
		    for(int j=0;j<g.length();j++){
		        if(g.charAt(j)=='1'){
		            gc++;
		        }
		        
		    }
		    for(int j=0;j<h.length();j++){
		        if(h.charAt(j)=='1'){
		            hc++;
		        }
		    }
		    if(gc==hc){
		        c++;
		    }
		}
		System.out.println(c);

	}
}
