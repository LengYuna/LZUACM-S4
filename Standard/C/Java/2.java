import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * Create Time: 2020.11.25
 * By: LovelyAnQi
 */
public class Main {
	
	public static int currentPrime = 1;
	
	public static int nextPrime() {
		
		for (++currentPrime;; ++currentPrime) {
			int i;
			for (i = 2; i * i < currentPrime; ++i) {
				if (currentPrime % i == 0) {
					break;
				}
			}
			if (i * i > currentPrime) {
				break;
			}
		}
		return currentPrime;
	}
	
	public static void main(String[] args) throws IOException {
		
		@SuppressWarnings("resource")
		Scanner stdin = new Scanner(System.in);
		int k = 0;
		BigInteger x = stdin.nextBigInteger(), mul = BigInteger.ONE;
		
		while (mul.compareTo(x) < 0) {
			mul = mul.multiply(BigInteger.valueOf(nextPrime()));
			++k;
		}
		
		System.out.println(k);
	}
}
