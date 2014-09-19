/*Viraj Bhalala
 */

import java.util.*;
public class Problem1 {
static int x =0;

//input
 public static void main(String[] args) {
 Scanner scan = new Scanner (System.in);
 String s= scan.nextLine();
 System.out.println(recursive(s));

}
 //recursive method to convert string to integer
public static int recursive(String s){
	int temp=0;
	//condition1
	if(s.length()==1){
		temp = Integer.parseInt(s.substring(0,1));
		x=(x*10)+temp;
		return x;
	}
	//condition2
	else{
		//multiply old number by 10 and add the next number by converting character to int by parseInt.
		temp = Integer.parseInt(s.substring(0,1));		
		x = (x*10)+ temp;
		return recursive(s.substring(1,s.length()));
				
	}
 
    }
}

