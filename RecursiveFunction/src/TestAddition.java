import java.util.Scanner;

public class TestAddition {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number For Addition");
		int num = sc.nextInt();
		int ans=addition(num);
		
		System.out.println(ans);
		int ans1=RecursiveAdd(num);
		System.out.println("Recursive"+ ans1);
	}

	private static int RecursiveAdd(int num) {
		if (num==1) {
			return 1;
		}
		return RecursiveAdd(num-1)+num;
	}

	

	private static int addition(int num) {
		int sum=0;
		for (int i = 1; i <=num; i++) {
			sum=sum+i;
			
		}
		return sum;
	}

}
