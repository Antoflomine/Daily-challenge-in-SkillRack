import java.util.*;
public class Hello {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] arr=str.split(":");
        int hr=Integer.parseInt(arr[0]);
        int min=Integer.parseInt(arr[1]);
        int sec=Integer.parseInt(arr[2]);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt(); 
        hr=(hr+x)%24;
        String t1=String.format("%02d:%02d:%02d",hr,min,sec);
        System.out.println(t1);
        
        min+=y;
        if(min>=60){
            hr=(hr+min/60)%24;
            min=min%60;
        }
        String t2=String.format("%02d:%02d:%02d",hr,min,sec);
         System.out.println(t2);
         
         sec+=z;
        if(sec>=60){
            min+=sec/60;
            sec=sec%60;
        }
        if(min>=60){
            hr=(hr+min/60)%24;
            min=min%60;
        }
        String t3=String.format("%02d:%02d:%02d",hr,min,sec);
        System.out.println(t3);
	}
}
