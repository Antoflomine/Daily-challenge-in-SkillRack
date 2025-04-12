import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<Integer> li=new ArrayList<>();
		int q=0;
		while(sc.hasNextLine()){
		    String line=sc.nextLine().trim();
		    if(line.isEmpty()) break;
            if(line.contains(" ")){
                String[] t=line.split(" ");
                for(String y:t){
                    li.add(Integer.parseInt(y));
                }
                q=1;
                break;
            }
            else{
              
                li.add(Integer.parseInt(line));
            }
		}  
	    if(q==1){
		    for(int i=li.size()-1;i>=0;i--){
		        System.out.println(li.get(i));
		    }
		}
		else{
		    for(int i=li.size()-1;i>=0;i--){
		        System.out.print(li.get(i)+" ");
		    }
		}
		   // System.out.println(line);
		
	}
}
