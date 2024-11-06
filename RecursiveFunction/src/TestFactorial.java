
public class TestFactorial {
	
	public static void main(String[] args) {
		 int ans=findFactorial(5);
		 System.out.println(ans);
	}

	private static int findFactorial(int num) {
		if(num==1)
			return 1;
		return num* findFactorial(num-1);	
	}

}
