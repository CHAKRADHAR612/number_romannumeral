import java.util.*;
public class Javabyme9{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a four digit number:");
		int n=sc.nextInt();
		int d,count=0,c;
		int x=n/1000;
		n%=1000;
		for(int i=1;i<=x;i++){
			System.out.print("M");
		}
		int y=n/500;
		n%=500;
		for(int i=1;i<=y;i++){
			System.out.print("D");
		}
		int z=n/100;
		n%=100;
		for(int i=1;i<=z;i++){
			System.out.print("C");
		}
		int p=n/50;
		n%=50;
		for(int i=1;i<=p;i++){
			System.out.print("L");
		}
		int q=n/10;
		n%=10;
		for(int i=1;i<=q;i++){
			System.out.print("X");
		}
		int r=n/5;
		n%=5;
		for(int i=1;i<=r;i++){
			System.out.print("V");
		}
		int s=n/1;
		for(int i=1;i<=s;i++){
			System.out.print("I");
		}
	}
}