# -Ritu Phogat
import numpy as np
import math
#from numpy import *
#array = list()
#i = int(input("How many row: "))
#j = int(input("How many column: "))
def main():
    N = int(input("Total Number of processes"))
    #print(is_square(N))
    i = j = isqrt(N)
    array = []
    aka =[]
    '''check if Number is a SquareRoot and accordingly form a matrix'''
    if is_square(N) == True :
        for k in range(1,N+1):
            aka.append(int(k))
        print aka

    else :
        tempN = N
        while is_square(tempN) == False :
            tempN = tempN +1
            #print tempN
        #print ("tempN",tempN)
        dif = tempN - N
        i = j = isqrt(tempN)
        #print ("dif",dif)
        for k in range(1,N+1):
            aka.append(int(k))
        #print aka
        for k in range(1,dif+1):
            aka.append(int(k))
        #print aka

    a = np.reshape(aka,(i,j))
    print a
#a = array([[1,2,3],
#      [4,5,6],
#      [7,8,9]])

    for i in range(len(a)):
        for j in range(len(a[i])):
            b= []
            print("voting set for process",a[i][j])
            for k in range(len(a)):
                b.append(a[i][k])
                b.append(a[k][j])
            print(set(b))
#print(a[:1,:5] and a[:3,:1])

def isqrt(n):
    x = n
    y = (x + 1) // 2
    while y < x:
        x = y
        y = (x + n // x) // 2
    return x

def is_square(apositiveint):
    x = apositiveint // 2
    seen = set([x])
    while x * x != apositiveint:
        x = (x + (apositiveint // x)) // 2
        if x in seen: return False
        seen.add(x)
    return True

if __name__ == "__main__":
    main()
