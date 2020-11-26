/**
 * Create Time: 2020.11.25
 * By: LovelyAnQi
 */
#include <iostream>
using namespace std;

#define ll long long

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
	cin >> x;

	while (mul < x) {
		mul *= nextPrime();
		if (++k == 16) {
			break;
		}
	}

	cout << k << endl;

	return 0;
}
