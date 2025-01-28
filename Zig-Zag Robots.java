// Zig-Zag Robots
// There are R robots in R rows (i.e., one robot in each row). There are two types of robots which are given below.
// Type 1: The robots start moving towards the East. Once it reaches the end of the row, it again starts moving towards the West. Similarly, the type 1 robots move in the direction East-West alternatively.
// Type 2: The robots start moving towards the West. Once it reaches the end of the row, it again starts moving towards the East. Similarly, the type 2 robots move in the direction West-East alternatively.
// The speed of each robot is 1 meter per second. The length of each row is C meters. The initial state of th robots is passed as the input. The program must print the state of the robots after T seconds as the output. The value of T is also passed as the input.
// Boundary Condition(s):
// 2＜=RC<=50
// 1＜＝T＜＝104
// Input Format:
// The first line contains R and C separated by a space.
// The next R lines, each contains C integers separated by a space.
// The (R+2)nd line contains T.
// Output Format:
// The first R lines, each contains C integers separated by a space.
// Example Input/Output 1:
// Input:
// 56
// 000010
// 002000
// 000200
// 100000
// 000002
// 3
// Output:
// 000100
// 020000
// 200000
// 000100
// 002000
// Explanation:
// Here R = 5, C = 6 and T = 3.
// O indicates the empty space.
// 1 indicates the position of the type 1 robot.
// 2 indicates the position of the type 2 robot.
// After 1 second, the state of the robots is given below.
// 000001
// 020000
// 002000
// 010000
// 000020
// After 2 seconds, the state of the robots is given below.
// 000010
// 200000
// 020000
// 001000
// 000200
// After 3 seconds, the state of the robots is given below.
// 000100
// 020000
// 200000
// 000100
// 002000

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
		int t=sc.nextInt();
		boolean[] dir=new boolean[r];
		for(int i=0;i<r;i++){
		    for(int j=0;j<c;j++){
		        if(arr[i][j]==1){
		            dir[i]=true;
		            break;
		        }
		        else if(arr[i][j]==2){
		            dir[i]=false;
		            break;
		        }
		    }
		}
		
		for(int s=0;s<t;s++){
		    int[][] res=new int[r][c];
		    for(int i=0;i<r;i++){
		        for(int j=0;j<c;j++){
		            if(arr[i][j]==1){
		                if(dir[i]){
		                if(j+1<c){
		                    res[i][j+1]=1;
		                }
		                else{
		                res[i][j-1]=1;
		                dir[i]=false;
		                }
		                }
		                else{
		                    if(j-1>=0){
		                        res[i][j-1]=1;
		                       }
		                       else{
		                           res[i][j+1]=1;
		                           dir[i]=true;
		                       }
		                }
		            }
		            else if(arr[i][j]==2){
		                if(!dir[i]){
		                if(j-1>=0){
		                    res[i][j-1]=2;
		                }
		                else{
		                res[i][j+1]=2;
		                dir[i]=true;
		                }
		                }
		                else{
		                    if(j+1<c){
		                        res[i][j+1]=2;
		                    }
		                    else{
		                        res[i][j-1]=2;
		                        dir[i]=false;
		                    }
		                }
		            }
		        }
		    }
		    arr=res;
		
	//System.out.println(Arrays.deepToString(res));
		}
		for(int i=0;i<r;i++){
		    for(int j=0;j<c;j++){
		        System.out.print(arr[i][j]+" ");
		    }
		    System.out.println();
		}

        
	

	}
}
