import java.util.*;
public class Hello {

    public static void main(String[] args) {
//Your Code Here
Scanner sc=new Scanner(System.in);
String N=sc.nextLine();
int X=sc.nextInt();
int Y=sc.nextInt();

String a=Integer.toString(Integer.parseInt(N,X),Y);
// String b=Integer.toString(Integer.parseInt(a,Y));
System.out.print(a);


}
}
