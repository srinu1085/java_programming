//Transpose of a matrix


import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int a[][] = new int[10][10];
	    int b[][] = new int[10][10];
	    
	    Scanner sc = new Scanner(System.in);
	    for(int i=0;i<2;i++){
	        for(int j=0;j<2;j++){
	            a[i][j] = sc.nextInt();
	        }
	    }
	    
	    for(int i=0;i<2;i++){
	        for(int j=0;j<2;j++){
	            b[i][j]=a[j][i];
	        }
	    }
	    
	    for(int i=0;i<2;i++){
	        for(int j=0;j<2;j++){
	            System.out.print(b[i][j]);
	            System.out.print("  ");
	        }
	        System.out.println();
	    }   
	}
}
