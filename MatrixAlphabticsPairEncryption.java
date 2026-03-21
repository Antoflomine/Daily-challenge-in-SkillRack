import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[][] str=new String[5][5];
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				str[i][j]=sc.next();
			}
		}
		String w=sc.next();
		String res="";
		for(int i=0; i<w.length()-1; i=i+2) {
		    int a=0,b=0,c=0,d=0;

			for(int j=0; j<5; j++) {
				for(int k=0; k<5; k++) {

					if(w.charAt(i)== str[j][k].charAt(0)) {
						a=j;
						b=k;

					}
					if(w.charAt(i+1)==str[j][k].charAt(0)) {
						c=j;
						d=k;

					}

				}
			


			}
				if(a==c){
			    res+=str[a][(b+1)%5].charAt(0);
			    res+=str[c][(d+1)%5].charAt(0);
			}
			 else if(b==d){
			    res+=str[(a+1)%5][b].charAt(0);
			    res+=str[(c+1)%5][d].charAt(0);
			}
			else if(a!=c && b!=d){
			 
			    res+=str[a][d].charAt(0);
			        res+=str[c][b].charAt(0);
			}
			
			System.out.println(a+" "+b);
			System.out.println(c+" "+d);


		}
		System.out.println(res);
	}
}Matric
