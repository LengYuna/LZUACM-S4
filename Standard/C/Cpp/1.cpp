/**
 * Create Time: 2020.11.25
 * By: LovelyAnQi
 */
#include <iostream>
using namespace std;

#define ull unsigned long long

ull currentPrime = 1;

ull nextPrime() {

	for (++currentPrime;; ++currentPrime) {
		ull i;
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
	ull x, mul = 1, k = 0;
	cin >> x;

	while (mul < x) {
		mul *= nextPrime();
		++k;
	}

	cout << k << endl;

	return 0;
}
