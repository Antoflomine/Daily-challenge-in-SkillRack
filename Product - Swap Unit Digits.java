import java.util.*;
public class Main
{
public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();
        char c=a.charAt(a.length()-1);
        a=a.substring(0,a.length()-1)+""+b.charAt(b.length()-1);
       
        b=b.substring(0,b.length()-1)+""+c;
        System.out.print(Long.parseLong(a)*Long.parseLong(b));
       

   
}
}
