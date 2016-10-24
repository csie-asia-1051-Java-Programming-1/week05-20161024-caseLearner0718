package ex;
/*
 * Topic: 設計一個程式由 0~9 的亂數隨機產生一 10*10 的二維陣列，將行列互換輸出(即輸出轉置矩陣)
 * Date: 2016/10/24
 * Author: 1050210XX 周永振老師
 */
import java.util.Scanner;
import java.util.Random;
public class ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		Random ran = new Random();
		int[][] val = new int[10][10];
		for(int a=0;a<10;a++){
			for(int b=0;b<10;b++){
				val[a][b]=ran.nextInt(10);
			}
		}
		for(int a=0;a<10;a++){
			for(int b=0;b<10;b++){
				System.out.print(val[b][a] + " ");
			}
			System.out.println();
		}
	}

}
