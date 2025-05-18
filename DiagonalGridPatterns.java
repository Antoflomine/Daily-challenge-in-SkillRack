// 2x1 
// 3x3 (1+2)
// 4x6  (3 +3)
// 5x10 (6 + 4)

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int row = 1, col = 1, h = 1;
		while(row <= num && col <= num) { 
		    for(int  i=0; i<row; i++) {
		        if(row!=1) {
		          
		            for(int j=0; j<h-1; j++) { 
		                    System.out.print("- ");
		            }
		            
		        }
		        for(int j=0; j<col; j++) {
		            System.out.print("* ");
		        }
		        System.out.println();
		    }
		    row++;
		    col++;
		 
		   h+=(row-1);
		   
		  
		}
	}
}
