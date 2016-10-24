package hw;
import java.util.Scanner;
public class hw03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int tal=1;
		int a=1;
		while(tal<10000){
			tal*=n;
			a++;
		}
		System.out.print(a);
	}
}
