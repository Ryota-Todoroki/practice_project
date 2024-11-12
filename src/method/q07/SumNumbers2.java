package method.q07;

public class SumNumbers2 {

	    public static int calculateSum(int intArg, double doubleArg) {
	        return (int) (intArg + doubleArg); 
	    }

	    public static void main(String[] args) {
	        int firstArg = 5;
	        double secondArg = 3.3;

	        int sum = calculateSum(firstArg, secondArg);

	        System.out.println("第一引数（整数）：" + firstArg);
	        System.out.println("第二引数（実数）：" + secondArg);
	        System.out.println("加算結果：" + sum);
	    }
}
