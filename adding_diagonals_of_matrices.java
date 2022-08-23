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
	    int diagonal_sum=0,sum=0;
	    for(int i=0;i<2;i++){
	        diagonal_sum=0;
	        for(int j=0;j<2;j++){
	            if(i==j){
	                diagonal_sum+=a[i][j]+b[i][j];
	                c[i][j]=diagonal_sum;
	                sum+=diagonal_sum;
	            }
	            else{
	                c[i][j]=0;
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
	    System.out.println(sum);
	}
}
