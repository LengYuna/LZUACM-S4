/**
 * Create Time: 2020.11.25
 * By: LovelyAnQi
 */
#include <stdio.h>

#define ll unsigned long long

ll currentPrime = 1;

ll nextPrime() {

	for (++currentPrime;; ++currentPrime) {
		ll i;
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

int main()
{
	ll x, mul = 1, k = 0;
	scanf("%lld", &x);

	while (mul < x) {
		mul *= nextPrime();
		if (++k == 16) {
			break;
		}
	}

	printf("%d\n", (int)k);

	return 0;
}
