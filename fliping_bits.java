//to flip bits to make 1's and 0's equal

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    String str;
	    Scanner sc = new Scanner(System.in);
	    str = sc.nextLine();
	    int a=0,b=0;
	    for(int i=0;i<str.length();i++){
	        if(str.charAt(i) == '1'){
	            a+=1;
	        }
	        else{
	            b+=1;
	        }
	    }
	    int k=0;
	    while(true){
	        if(a==b){
	            System.out.println(k);
	            break;
	        }
	        k+=1;
	        a-=1;
	        b+=1;
	    }
	}
}
