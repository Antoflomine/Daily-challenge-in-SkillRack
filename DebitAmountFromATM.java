import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int balance=sc.nextInt();
	    int remain=balance;
	    int[] notes={2000,500,200,100};
	    int[] count=new int[notes.length];
	    for(int i=0;i<notes.length;i++){
	        count[i]=remain/notes[i];
	        remain=remain%notes[i];
	    }
	    System.out.println(Arrays.toString(count));
	    for(int i=0;i<count.length;i++){
	        if(count[i]!=0){
	            System.out.println(notes[i]+"-"+count[i]);
	        }
	    }
	    if(remain>0)
	    System.out.println("Changes coins-"+remain);
	  
	}
}
