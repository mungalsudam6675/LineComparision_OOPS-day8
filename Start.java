package Line_Comparision_OOPS;

import java.util.*;

public class Start {
	public static int compareTo() {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter X1 and Y1 value");
		int x1 = scan.nextInt();
        int y1 = scan.nextInt();
		System.out.println("enter X1 and Y2 value");
        int x2 = scan.nextInt();
        int y2 = scan.nextInt();
		double ans1=Math.sqrt( (x2 - x1) ^ 2 + (y2 - y1) ^ 2 );
		
		System.out.println("enter a1 and b1 value");
		int a1 = scan.nextInt();
        int b1 = scan.nextInt();
		System.out.println("enter b1 and b2 value");
        int a2 = scan.nextInt();
        int b2 = scan.nextInt();
		double ans2=Math.sqrt( (x2 - x1) ^ 2 + (y2 - y1) ^ 2 );
		
		System.out.println("Length of line first = " + ans1);
		System.out.println("Length of line second = " + ans2);
		
		if(ans1 == ans2) {
			System.out.println("Both line ars equal");
		}
		else if(ans1 > ans2) {
			System.out.println("Line One is greater");
		}
		else  {
			System.out.println("Line two is greater");	
		}
		return 0;
}

	public static void main(String[] args) {
			
			compareTo();

	}
}


