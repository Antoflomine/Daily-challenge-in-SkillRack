import java.util.*;
public class Main
{
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int n = sc.nextInt();
   sc.nextLine();
   String[] str=new String[n];
   int l=0,max=0,c=0;
   String o="";
   for(int i=0;i<n;i++)
   {
       str[i]=sc.nextLine();
   }
   String e = sc.nextLine();
   for(int i=0;i<n;i++){
       if(str[i].contains(e)){
           //System.out.println("hi");
           l=str[i].length();
       }
       else{
           c++;
       }
       if(max<l){
           max=l;
           o=str[i];
       }
   }
   if(c==n){
       System.out.println("FILE NOT FOUND");
   }
   else{
System.out.println(o);
   }
}
}
