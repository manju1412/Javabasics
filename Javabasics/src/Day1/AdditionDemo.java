package Day1;

import java.util.Scanner;

public class AdditionDemo {

	public static void main(String[] args) {
		int a,b,c,d;
	    Scanner mr= new Scanner(System.in);
	    a=mr.nextInt();
	    b=mr.nextInt();
	    mr.nextLine();
	    String m=mr.nextLine();
		c=a+b;
		d=a-b;
		System.out.println("Addition:"+c);
		System.out.println("Subtraction:"+d);
		System.out.println("name"+m);
		
		
		
	}

}