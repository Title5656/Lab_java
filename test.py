list = [['a','b','a'],['A','B','C']]


for i in list:
        temp = i[::-1]
        if temp == i:
            print("palindrome")
        else:
            print("not palindrome")
