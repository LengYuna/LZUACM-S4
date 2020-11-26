# Create Time: 2020.11.26
# By: LovelyAnQi

x, mul, k, prime = int(input()), 1, 0, 1

while mul < x:
    i = int()
    while i * i <= prime:
        prime += 1
        i = 2
        while i * i < prime:
            if prime % i == 0:
                break
            i += 1
    mul *= prime
    k += 1

print(k)
