list1 = input("Enter list 1, separated by spaces.").split()
list1.reverse()
number1 = int(''.join(list1))
list2 = input("Enter list 2, separated by spaces.").split()
list2.reverse()
number2 = int(''.join(list2))
sum = list(str(number1+number2))
list1.reverse()
list2.reverse()
sum.reverse()
print("""The sum of reversed
{}+
{}=
{} """.format(list1,list2,sum))

