import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int a[][] = new int[10][10];
	    int b[][] = new int[10][10];
	    int c[][] = new int[10][10];
	    Scanner sc = new Scanner(System.in);
	    for(int i=0;i<2;i++){
	        for(int j=0;j<2;j++){
	            a[i][j] = sc.nextInt();
	            b[i][j] = sc.nextInt();
	        }
	    }
	    for(int i=0;i<2;i++){
	        for(int j=0;j<2;j++){
	            c[i][j]=0;
	            for(int k=0;k<2;k++){
	                c[i][j]+=a[i][k]*b[k][j];
	            }
	        }
	    }
	    for(int i=0;i<2;i++){
	        for(int j=0;j<2;j++){
	            System.out.print(c[i][j]);
	            System.out.print("  ");
	        }
	        System.out.println();
	    }
	}
}
