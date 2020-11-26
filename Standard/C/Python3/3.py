# Create Time: 2020.11.26
# By: LovelyAnQi

from functools import reduce
prime = list(filter(lambda n : min(map(lambda i : n == 2 or n % i, range(2, max(n, 3)))), range(1, 100)))
x = int(input())
print(min(filter(lambda i : reduce(lambda n, m : n * m, prime[0:i + 1]) >= x, range(1, 20))))
