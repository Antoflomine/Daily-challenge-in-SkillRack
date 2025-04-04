import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String[] arr=str.split("-");
		char[] ch=new char[arr.length];
		int[] in=new int[arr.length];
		for(int i=0;i<arr.length;i++){
		    String[] cr=arr[i].split("[0-9]");
		    for(int j=0;j<cr.length;j++){
		        if(cr[j]!=""){
		            ch[i]=cr[j].charAt(0);
		        }
		    }
		    String[] num=arr[i].split("[a-zA-Z]");
		    for(int j=0;j<num.length;j++){
		        if(num[j]!=""){
		            in[i]=Integer.parseInt(num[j]);
		        }
		    }
		}
		for(int i=0;i<in.length;i++){
		    for(int j=0;j<in.length-1;j++){
		        if(in[j]>in[j+1]){
		            int t=in[j];
		            char r=ch[j];
		            in[j]=in[j+1];
		            ch[j]=ch[j+1];
		            in[j+1]=t;
		            ch[j+1]=r;
		        }
		    }
		}
		for(int i=0;i<ch.length;i++){
		    System.out.print(ch[i]);
		}
	//	System.out.println(Arrays.toString(in));
		
		

	}
}
