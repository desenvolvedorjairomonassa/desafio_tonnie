

import java.util.*;

public class Main{
	

	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int n= Integer.parseInt(input.next());
		while (n>0) { 
  		int m=0;
  		int j=0;
  		for(int i=0;i<n;i++){
  		  int p= Integer.parseInt(input.next());
  		  if (p==0) m++;
  		  else j++;
  		  
  		}
  		String s=String.valueOf(m);  
      System.out.println("Mary won "+m+" times and John won "+j+" times");
      n= Integer.parseInt(input.next());
		}
	}
}
