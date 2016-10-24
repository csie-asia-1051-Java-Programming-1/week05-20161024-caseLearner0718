package ex;

/*
 * Topic: 某個陣列中含有所有學生的學號，但並沒有按照大小次序排列。請寫一程式依學號大小排列並將結果輸出。
 * Date: 2016/10/24
 * Author: 1050210XX 周永振老師
 */
import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入共幾筆資料");
		int time = scn.nextInt();
		int[] val = new int[time];
		int[] val2 = new int[time];
		int big = 0;
		int space=-1;
		for (int a = 0; a < time; a++) {
			val[a] = scn.nextInt();
		}
		for (int b = 0; b < time; b++) {
			for (int a = 0; a < time; a++) {
				if (val[a] > big) {
					big = val[a];
					space=a;
				}
			}
			val2[b]=big;
			val[space]=-1;
			big=0;
			space=0;
		}
		System.out.print("由大道小的排序為:");
		for (int a = 0; a < time; a++) {
			System.out.print(val2[a] + " ");
		}
	}
}