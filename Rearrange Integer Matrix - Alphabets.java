// Rearrange Integer Matrix - Alphabets
// The program must accept an integer matrix M1 and a character matrix M2 having the same size R*C as the input. The matrix M2 contains only lower case alphabets. The program must rearrange the integer matrix M1 based on the positions of the alphabets in M2 after sorting the alphabets. The integer value in M1 must be relocated to the original position (before sorting) of the alphabet in M2 in having the same position in the sorted matrix M2. If two or more alphabets are same, then the program must consider them in the order of their occurrence. Finally, the program must print the modified matrix M1 as the output.
// Boundary Condition(s):
// 2 <= R, C < = 50
// 1 < = Matrix element value <= 1000
// Input Format:
// The first line contains R and C separated by a space.
// The next R lines, each contains C integer values representing the integer matrix M1.
// The next R lines from the (R+2)th line, each contains C alphabets representing the character matrix M2.
// Output Format:
// The first R lines, each contains C integers representing the modified matrix M1.
// Example Input/Output 1:
// Input:
// 44
// 66 58 42 85
// 41 24 69 59
// 80 67 50 89
// 23 17 11 82
// jyge
// vwib
// I fcp
// ennr
// Output:
// 59 82 24 42
// 17 11 69 66
// 80 41 58 89
// 85 67 50 23
// Explanation:
// The integers in the matrix M1 are given below.
// 66 58 42 85
// 41 24 69 59
// 80 67 50 89
// 23 17 11 82
// The alphabets of M2 in alphabetical order after sorting are given below. b ce e
// In n P rvwy
// 1st integer 66 is placed in the b's position.
// 2nd integer 58 is placed in the c's position.
// 3ra integer 48 is placed in the e's position (first occurrence).
// 4th integer 85 is placed in the e's position (second occurrence).
// 5th integer 41 is placed in the f's position.
// 6th integer 24 is placed in the g's position.
// 7th integer 69 is placed in the i's position. gth integer 59 is placed in the j's position. gth integer 80 is placed in the l's position.
// 10th integer 67 is placed in the n's position (first occurrence).
// 11th integer 50 is placed in the n's position (second occurrence).
// 12th integer 89 is placed in the p's position.
// 13th integer 23 is placed in the r's position.
// 14th integer 17 is placed in the v's position.
// 15th integer 11 is placed in the w's position.
// 16th integer 82 is placed in the y's position.
// Now the matrix M1 becomes
// 59 82 24 42
// 17 11 69 66
// 80 41 58 89
// 85 67 50 23
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		int[][] arr=new int[r][c];
		for(int i=0;i<r;i++){
		    for(int j=0;j<c;j++){
		        arr[i][j]=sc.nextInt();
		    }
		}
		
		char[][] ch=new char[r][c];
		for(int i=0;i<r;i++){
		    for(int j=0;j<c;j++){
		        ch[i][j]=sc.next().charAt(0);
		    }
		}
		int[] io=new int[r*c];
		int d=0;
        char[] ws=new char[r*c];
        int a=0;
		char[] so=new char[r*c];
		int y=0;
		for(int i=0;i<r;i++){
		    for(int j=0;j<c;j++){
		        so[y++]=ch[i][j];
		        io[d++]=arr[i][j];
		        ws[a++]=ch[i][j];
		    }
		}
		for(int i=0;i<r*c;i++){
		    for(int j=0;j<(r*c)-1;j++){
		        if(so[j]>so[j+1]){
		            char t=so[j];
		            so[j]=so[j+1];
		            so[j+1]=t;
		        }
		    }
		}
		System.out.println(Arrays.toString(ws));
 		System.out.println(Arrays.toString(io));
		Set<Integer> res=new LinkedHashSet<>();
		int z=0;
		for(int i=0;i<r*c;i++){
		    for(int j=0;j<r*c;j++){
		        if(ws[i]==so[j]){
		            if(!res.add(io[j])){
		                for(int e=j;e<r*c;e++){
		                    if(ws[i]==so[e]){
		                        res.add(io[e]);
		                    }
		                }
		            }
		            else{
		            res.add(io[j]);
		            break;
		            }
	
		        }
		    }
		}
		
		System.out.print(res);
		List<Integer> li=new ArrayList<>(res);
		int f=0;
	    int[][] ans=new int[r][c];
	    for(int i=0;i<r;i++){
	        for(int j=0;j<c;j++){
	            ans[i][j]=li.get(f++);
	        }
	    }
	    for(int i=0;i<r;i++){
	        for(int j=0;j<c;j++){
	            System.out.print(ans[i][j]+" ");
	        }
	        System.out.println();
	    }
	    //System.out.println(Arrays.deepToString(ans));
		
		
		

	}
}
