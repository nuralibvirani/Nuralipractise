
public class FibonacciNumber {

    public static void main(String[] args){
        int count = 10, a = 0, b = 1;

        System.out.println("Fibonacci Series of " + count + "numbers :");
        for(int i = 1; i <= count ; ++i) {
            System.out.println(a + " ");
            int sum = a + b;
            a=b;
            b=sum;
        }
    }

}
