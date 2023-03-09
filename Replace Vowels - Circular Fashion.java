public class Main
{
public static void main(String[] args) {
 String str="icecreamchocolate";
 String vowels="aeiou";
 int c=0;
 for(int i=0;i<str.length();i++){
     if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
         System.out.print(vowels.charAt(c));
         c++;
     }
     else{
         System.out.print(str.charAt(i));
     }
      if(c==5){
     c=0;
 }
 }

   
}
