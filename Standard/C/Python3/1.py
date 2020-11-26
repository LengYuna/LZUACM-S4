# Create Time: 2020.11.25
# By: LovelyAnQi

currentPrime = 1

def nextPrime():
    global currentPrime
    currentPrime += 1
    while True:
        i = 2
        while i * i < currentPrime:
            if currentPrime % i == 0:
                break
            i += 1
        if i * i > currentPrime:
            break
        currentPrime += 1
    return currentPrime

x = int(input())
mul = 1
k = 0

while mul < x:
    mul *= nextPrime()
    k += 1

print(k)
