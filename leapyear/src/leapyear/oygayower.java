package leapyear;
import java.util.Scanner;
public class oygayower {
	static void year(int z) {
		if((z%4==0 && z%100 !=0) || (z%400==0)) {
			System.out.println("this is a leap year");
		}
		else {
			System.out.println("this is not a leap year");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner what = new Scanner(System.in);
		System.out.println("gimmie a year");
		int z = what.nextInt();
		year(z);
	}

}
