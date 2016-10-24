package ex;
/*
 * Topic: 讓使用者輸入一正整數 n，並輸出 2^1+2^2+2^3+...+2^n 的值。
 * Date: 2016/10/24
 * Author: 1050210XX 周永振老師
 */
import java.util.Scanner;
public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int tal=0;
		int c=2;
		for(int a=1;a<=n;a++){
			for(int b=1;b<=a;b++){
				c*=b;
			}
			tal+=c;
		}
		System.out.println(tal);
	}

}
