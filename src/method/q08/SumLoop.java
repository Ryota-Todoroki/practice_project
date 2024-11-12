package method.q08;

public class SumLoop {

	public static int sumLoop(int min, int max) {
		int sum = 0;
		for (int i = min; i <= max; i++) {
			sum += i;
		}
		return sum;
	}

	public static void main(String[] args) {
		int minValue = 1;
		int maxValue = 100;
        	
		int result = sumLoop(minValue, maxValue);
        
		System.out.println("最小値：" + minValue);
		System.out.println("最大値：" + maxValue);
		System.out.println("加算結果：" + result);
    }
}
