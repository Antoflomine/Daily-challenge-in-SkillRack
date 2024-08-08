import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=0,b=1;
		ArrayList<Integer> arr=new ArrayList<>();
		arr.add(a);
		arr.add(b);
		int i=2;
		int sum=0;
		while(sum<n){
		     sum=a+b;
		    arr.add(sum);
		    a=b;
		    b=sum;
		    i++;
		}
//System.out.println(arr);
int f=0;
        for(int k=0;k<arr.size()-1;k++){
            for(int j=k+1;j<arr.size();j++){
                if((arr.get(k)+arr.get(j))==n){
                    System.out.println(arr.get(k)+" "+arr.get(j));
                    f=1;
                    return;
                }
            }
        }
        if(f==0){
            System.out.println("-1");
        }
	}
}
