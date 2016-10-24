package hw;
import java.util.Scanner;
public class hw04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		float val=0;
		int a=1,b=2;
		while(b<=2*n){
			val=val + (float)1/(a*b);
			a+=2;
			b+=2;
		}
		System.out.print(val);
	}

}
