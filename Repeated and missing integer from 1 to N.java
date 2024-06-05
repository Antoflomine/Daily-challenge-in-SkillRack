import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> arr=new ArrayList<>();
		while(sc.hasNext()){
		    arr.add(sc.nextInt());
		}
		//System.out.println(arr);
		int max=0;
		for(int i=0;i<arr.size();i++){
		    if(arr.get(i)>max){
		        max=arr.get(i);
		    }
		}
	Collections.sort(arr);
	int r=0;

        Set<Integer> set=new HashSet<>();
        int dup=-1;
        for(int i=0;i<arr.size();i++){
            if(set.contains(arr.get(i))){
                dup=arr.get(i);
                break;
            }
            set.add(arr.get(i));
        }
        
        System.out.print(dup+" ");
        int n=max;
      int expectedSum=n*(n+1)/2;
      int actualSum=0;
      for(int i=0;i<max;i++){
          actualSum+=arr.get(i);
      }
    //   System.out.println(expectedSum);
    //   System.out.println(actualSum);
      int miss=expectedSum-(actualSum-dup);
      System.out.println(miss);
       
        
	}
}
