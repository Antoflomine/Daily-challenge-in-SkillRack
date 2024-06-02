import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String arr[]=str.split("-");
		int a=arr[0].length();
		int b=arr[1].length();
		int c=arr[2].length();
	//	System.out.println(a+" "+b+" "+c);
		if(a==3 || b==3 || c==3){
		    if(a==2 && b==3 && c==4){
		        System.out.print("DD-MMM-YYYY");
		    }
		    else if(a==3 && b==2 && c==4){
		        System.out.println("MMM-DD-YYYY");
		    }
		    else if(a==4 && b==3 && c==2){
		        System.out.println("YYYY-MMM-DD");
		    }
		    else if(a==4 && b==2 && c==3){
		        System.out.println("YYYY-DD-MMM");
		    }
		    else if(a==3 && b==4 && c==2){
		        System.out.println("MMM-YYYY-DD");
		    }
		    else if(a==2 && b==4 && c==3){
		        System.out.println("DD-YYYY-MMM");
		    }
		}
		else if((a==2 && b==2) || (b==2 && c==2) || (c==2 && a==2)){
		    if(a==2 && b==2){
		        if(Integer.parseInt(arr[0])<=12 && Integer.parseInt(arr[1])>12){
		            System.out.print("MM-DD-YYYY");
		        }
		        else if(Integer.parseInt(arr[1])<=12 && Integer.parseInt(arr[0])>12){
		            System.out.print("DD-MM-YYYY");
		        }
		        else{
		            System.out.println("-1");
		        }
		    }
		    if(b==2 && c==2){
		        if(Integer.parseInt(arr[1])<=12 && Integer.parseInt(arr[2])>12){
		            System.out.println("YYYY-MM-DD");
		        }
		        else if(Integer.parseInt(arr[2])<=12 && Integer.parseInt(arr[1])>12){
		            System.out.println("YYYY-DD-MM");
		        }
		        else{
		            System.out.println("-1");
		        }
		    }
		    if(c==2 && a==2){
		        if(Integer.parseInt(arr[2])<=12 && Integer.parseInt(arr[0])>12){
		            System.out.println("DD-YYYY-MM");
		        }
		        else if(Integer.parseInt(arr[0])<=12 && Integer.parseInt(arr[2])>12){
		            System.out.println("MM-YYYY-DD");
		        }
		        else{
		            System.out.println("-1");
		        }
		    }
		    
		    
		    
		}
	
		
		

	}
}
