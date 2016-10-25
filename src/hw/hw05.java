package hw;
import java.util.Scanner;
public class hw05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[][] val = new int[n][n];
		int x=0,y=0,where=0,where2=0;
		boolean flat = false;
		for(int a=1;a<=n*n;a++){
			val[y][x]=a;
//			System.out.println("目前位置X:" + (x+1) + " Y:" + (y+1) + " a:" + a);
			if(y==0 && flat==false){
				where++;
				x=0;
				y=where;
			}else if(x==n-1 && flat==true){
				where2++;
				y=n-1;
				x=where2;
			}else{
				x++;
				y--;
			}
			if(y==0&&x==n-1){
				flat=true;
			}
		}
		
		for(int a=0;a<n;a++){
			for(int b=0;b<n;b++){
				System.out.print(val[a][b] + "\t");
			}
			System.out.println();
		}
	}
}
