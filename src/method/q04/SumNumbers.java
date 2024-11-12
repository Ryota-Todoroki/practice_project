package method.q04;

public class SumNumbers {

    public static int calculateSum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int firstArg = 3;
        int secondArg = 2;
        int sum = calculateSum(firstArg, secondArg);

        System.out.println("第一引数：" + firstArg);
        System.out.println("第二引数：" + secondArg);
        System.out.println("加算結果：" + sum);
    }
}