import java.io.BufferedInputStream;
import java.io.IOException;

/**
 * Create Time: 2020.11.25
 * By: LovelyAnQi
 */
public class Main {
	
	public static final BufferedInputStream stdin;
	
	static {
		stdin = new BufferedInputStream(System.in, 0x100000);
	}
	
	public static long quickRead() throws IOException {
		
		long res = 0, sign = 1, in;
		while ((in = stdin.read()) != -1 && in > 0x20) {
			if (in == '+' || in == '-') {
				sign *= in == '-' ? -1 : 1;
				continue;
			}
			res = res * 10 + in - '0';
		}
		return res * sign;
	}
	
	public static long currentPrime = 1;
	
	public static long nextPrime() {
		
		for (++currentPrime;; ++currentPrime) {
			long i;
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
		
		long x, mul = 1, k = 0;
		x = quickRead();

		while (mul < x) {
			mul *= nextPrime();
			if (++k == 16) {
				break;
			}
		}

		System.out.println(k);
	}
}
