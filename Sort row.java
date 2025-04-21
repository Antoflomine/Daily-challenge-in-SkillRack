import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		int C = sc.nextInt();
		sc.nextLine();
		String[] arr = new String[R];
		char[] ch = new char[R];
		int[] in=new int[R];
		for(int i=0; i<R; i++) {
		        arr[i] = sc.nextLine();
		        in[i]=i;
		}
		
	//	System.out.print(Arrays.toString(arr));
        for(int i=0;i<R;i++){
            for(int j=0;j<arr[i].length();j++){
                if(arr[i].charAt(j)>='a' && arr[i].charAt(j)<='z'){
                    ch[i]=arr[i].charAt(j);
                }
            }
        }
        for(int i=0;i<R;i++){
            for(int j=0;j<R-1;j++){
                if(ch[j]>ch[j+1] || (ch[j]==ch[j+1] && in[j]<in[j+1])){
                    char tt=ch[j];
                    String t=arr[j];
                    int ty=in[j];
                    ch[j]=ch[j+1];
                    in[j]=in[j+1];
                    arr[j]=arr[j+1];
                    ch[j+1]=tt;
                    arr[j+1]=t;
                    in[j+1]=ty;
                  
                }
            }
        }
        for(int i=0;i<R;i++){
            System.out.println(arr[i]);
        }
       // System.out.println(Arrays.toString(arr));
	}
}
