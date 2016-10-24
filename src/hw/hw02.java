package hw;
import java.util.Scanner;
public class hw02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int a=1;
		int tal=0;
		while(tal<n){
			tal+=a;
			a++;
//			System.out.println(tal);
		}
		a-=2;
		System.out.print(a);
	}
}