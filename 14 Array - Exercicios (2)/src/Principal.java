
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] fibo = new int[10];
		fibo[0] = 0;
		fibo[1] = 1;
		for(int i=2; i < fibo.length ; i++){
			fibo[i] = fibo[i-1] + fibo[i-2];
		}
		
		for (int i : fibo) {
			System.out.println(i);
		}
	}
}
