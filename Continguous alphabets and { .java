import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String str="";
		for(int i=0;i<s.length();i++){
		    if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
		    str+=Character.toLowerCase(s.charAt(i));
		        
		    }
		    else{
		        str+=s.charAt(i);
		    }
		}
	int start=0;
    int n=str.length();
    while(start<n){
       int end=start;
        while(end+1<n && str.charAt(end+1)==str.charAt(end)+1){
          
            end++;
        }
        if(end>start){
            System.out.print("{"+s.substring(start,end+1)+"}");
        }
        else{
            System.out.print(s.charAt(end));
        }
      
    
    //System.out.println(start+" "+end);
    start=end+1;
    }

	}
}
