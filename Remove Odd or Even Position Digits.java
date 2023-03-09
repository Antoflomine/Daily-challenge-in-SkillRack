import java.util.*;
public class Main
{
public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        int i=0;
        String sum="";
    if(Long.parseLong(a)%2==0){
        i=0;
    }    
    else{
        i=1;
    }
    for(;i<a.length();i=i+2){
        sum+=a.charAt(i);
    }
System.out.print(Math.abs(Long.parseLong(sum)));
   
}
}
